package com.dream.util;

import com.dream.domain.user.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-3-15
 * Time: 下午7:58
 */
public class SecurityUtil {

    public static String currentUserGuid() {
        User user = currentUser();
        if (user == null) {
            return null;
        }
        return user.guid();
    }

    public static User currentUser() {
        SecurityContext context = SecurityContextHolder.getContext();
        if (context == null) {
            return null;
        }
        Authentication authentication = context.getAuthentication();
        if (authentication == null) {
            return null;
        }

        return (User) authentication.getPrincipal();
    }

    public static void refreshUserInCache(String email, String nickname) {
        User user = currentUser();
        if (user != null) {
            user.changeInfo(email, nickname);
        }
    }
}
