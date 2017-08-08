package com.cms.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.model.user.UserDO;
import com.cms.service.user.UserService;

@Service("userRealm")
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String userName = (String) principals.getPrimaryPrincipal();
        UserDO user = userService.getUser(userName);
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.setRoles(userService.getRolesByUserId(user.getId()));
        authorizationInfo.setStringPermissions(userService.getPermissionsByUserId(user.getId()));
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
                                                                                  throws AuthenticationException {
        String userName = (String) token.getPrincipal();
        UserDO user = userService.getUser(userName);
        if (user == null) {
            //throw new UnknownAccountException();
            user = new UserDO();
            user.setUsername("zhangsan");
            user.setPassword("123456");
        }

        SimpleAuthenticationInfo authorizationInfo = new SimpleAuthenticationInfo(
            user.getUsername(), user.getPassword(), getName());
        return authorizationInfo;
    }

}
