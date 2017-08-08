package com.cms.model.user;

import java.io.Serializable;

import com.cms.model.BaseDO;

public class PermissionDO extends BaseDO implements Serializable {

    /**  */
    private static final long serialVersionUID = 4003342373204716190L;

    private String            name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
