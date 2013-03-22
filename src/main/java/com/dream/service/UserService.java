package com.dream.service;

import com.dream.dto.index.BriefUserDTO;
import com.dream.dto.user.UserInfoChangeDTO;
import com.dream.dto.user.registration.RegistrationDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-15
 * Time: 上午1:31
 */
public interface UserService extends UserDetailsService {

    void createApplicant(RegistrationDTO registrationDTO);

    boolean emailExist(String email);

    UserInfoChangeDTO loadUserInfoChangeDTObyUserGuid(String currentUserGuid);

    void changeUserInfo(UserInfoChangeDTO userInfoChangeDTO);

    boolean existUsername(String username);

    List<BriefUserDTO> loadBriefUserDTOs();
}
