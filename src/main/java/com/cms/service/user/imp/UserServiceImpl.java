package com.cms.service.user.imp;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.cms.model.user.UserDO;
import com.cms.service.user.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

    public UserDO getUser(String userName) {
        // TODO Auto-generated method stub
        return null;
    }

    public Set<String> getRolesByUserId(Integer userId) {
        // TODO Auto-generated method stub
        return null;
    }

    public Set<String> getPermissionsByUserId(Integer userId) {
        // TODO Auto-generated method stub
        return null;
    }

}
