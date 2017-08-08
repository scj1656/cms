package com.cms.model.user;

import java.io.Serializable;
import java.util.List;

import com.cms.model.BaseDO;

public class UserDO extends BaseDO implements Serializable{

    /**  */
    private static final long serialVersionUID = 5632420992066788494L;

    private String username;

    private String password;

    private String phone;

    private List<RoleDO>       roles;

    private List<PermissionDO> permissions;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<RoleDO> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleDO> roles) {
        this.roles = roles;
    }

    public List<PermissionDO> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PermissionDO> permissions) {
        this.permissions = permissions;
    }

}
