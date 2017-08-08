package com.cms.model.user;

import java.io.Serializable;

import com.cms.model.BaseDO;

public class RoleDO extends BaseDO implements Serializable {

    /**  */
    private static final long serialVersionUID = 8592486637646078567L;

    private String roleName;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}
