package com.directory.service.role;

import java.util.Optional;

import com.directory.IGeneralService;
import com.directory.model.entity.Role;

public interface IRoleService extends IGeneralService<Role> {
	
    Optional<Role> findRolesByName(String name);

}
