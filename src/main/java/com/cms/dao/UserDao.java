package com.cms.dao;
import com.cms.model.user.PermissionDO;
import com.cms.model.user.RoleDO;
import com.cms.model.user.RolePermissionDO;
import com.cms.model.user.UserDO;
import com.cms.model.user.UserRoleDO;
import com.cms.model.user.query.UserQo;


public interface UserDao {
    
    Integer insert(UserDO user);
    
    Integer update(UserDO user);
    
    Integer delete(Integer id);
    
    UserDO query(UserQo qo);

    UserDO queryUserDetail(UserQo qo);

    Integer insertRole(RoleDO role);
    
    Integer updateRole(RoleDO role);
    
    Integer deleteRole(Integer id);
    
    Integer insertUserRole(UserRoleDO userRole);
    
    Integer deleteUserRole(Integer userId);
    
    Integer insertPermission(PermissionDO permission);
    
    Integer updatePermission(PermissionDO permission);
    
    Integer deletePermission(Integer id);
    
    Integer insertRolePermission(RolePermissionDO rolePermission);
    
    Integer deleteRolePermission(Integer roleId);
}
