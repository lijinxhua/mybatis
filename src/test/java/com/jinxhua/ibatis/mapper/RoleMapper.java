package com.jinxhua.ibatis.mapper;

import com.jinxhua.ibatis.entity.Role;

/**
 * mapper
 *
 * @author lijinghua
 * @date 2021-01-28
 * @history
 */
public interface RoleMapper {
    Role getRole(Long id);

    Role findRole(String roleName);

    int deleteRole(Long id);

    int insertRole(Role role);
}
