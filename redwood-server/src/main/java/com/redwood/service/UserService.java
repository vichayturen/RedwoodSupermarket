package com.redwood.service;

import com.redwood.dto.UserLoginDTO;
import com.redwood.entity.User;

public interface UserService {

    /**
     * 微信登录
     * @param userLoginDTO
     * @return
     */
    User wxLogin(UserLoginDTO userLoginDTO);
}
