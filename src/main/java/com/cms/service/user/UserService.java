package com.cms.service.user;

import java.util.Set;

import com.cms.model.user.UserDO;

public interface UserService {

    /**
     * 根据用户名获取用户信息
     * @param userName
     * @return
     * @date: 2017年7月5日 下午3:21:03
     */
    UserDO getUser(String userName);

    /**
     * 根据用户id获取角色信息
     * @param userId
     * @return
     * @date: 2017年7月5日 下午3:21:26
     */
    Set<String> getRolesByUserId(Integer userId);

    /**
     * 根据用户id获取权限信息
     * @param userId
     * @return
     * @date: 2017年7月5日 下午3:21:26
     */
    Set<String> getPermissionsByUserId(Integer userId);
}
