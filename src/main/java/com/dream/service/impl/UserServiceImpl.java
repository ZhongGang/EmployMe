package com.dream.service.impl;

import com.dream.dao.UserDao;
import com.dream.domain.user.Applicant;
import com.dream.domain.user.User;
import com.dream.dto.index.BriefUserDTO;
import com.dream.dto.user.UserInfoChangeDTO;
import com.dream.dto.user.registration.RegistrationDTO;
import com.dream.mail.MailService;
import com.dream.service.UserService;
import com.dream.util.SecurityUtil;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-15
 * Time: 上午1:31
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    private PasswordEncoder passwordEncoder;
    private MailService mailService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userDao.findUserByUsername(username);
    }

    @Override
    public void createApplicant(RegistrationDTO registrationDTO) {
        User user = registrationDTO.toNewApplicant(passwordEncoder);
        userDao.saveOrUpdate(user);
        mailService.sendRegistrationMail(user);
    }

    @Override
    public boolean emailExist(String email) {
        int count = userDao.findEmailCount(email);
        return count > 0;
    }

    @Override
    public UserInfoChangeDTO loadUserInfoChangeDTObyUserGuid(String currentUserGuid) {
        User user = userDao.findByGuid(User.class, currentUserGuid);
        return new UserInfoChangeDTO(user);
    }

    @Override
    public void changeUserInfo(UserInfoChangeDTO userInfoChangeDTO) {
        User user = userDao.findByGuid(User.class, userInfoChangeDTO.getUserGuid());
        String email = userInfoChangeDTO.getEmail();
        String nickname = userInfoChangeDTO.getNickname();
        if (userInfoChangeDTO.isShouldChangePassword()) {
            String newPassword = userInfoChangeDTO.getNewPassword();
            newPassword = passwordEncoder.encodePassword(newPassword, null);
            user.changeInfo(newPassword, email, nickname);
        } else {
            user.changeInfo(email, nickname);
        }
        SecurityUtil.refreshUserInCache(email, nickname);
    }

    @Override
    public boolean existUsername(String username) {
        int count = userDao.findUsernameCount(username);
        return count > 0;
    }

    @Override
    public List<BriefUserDTO> loadBriefUserDTOs() {
        List<Applicant> users = userDao.findAll(Applicant.class);
        List<BriefUserDTO> briefUserDTOs = new ArrayList<BriefUserDTO>();
        for (User user : users) {
            BriefUserDTO briefUserDTO = new BriefUserDTO(user);
            briefUserDTOs.add(briefUserDTO);
        }
        return briefUserDTOs;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public void setMailService(MailService mailService) {
        this.mailService = mailService;
    }
}
