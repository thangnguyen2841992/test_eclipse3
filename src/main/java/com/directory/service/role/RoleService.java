package com.directory.service.role;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.directory.model.entity.Role;
import com.directory.repository.IRoleRepository;

@Service
public class RoleService implements IRoleService {
	
	@Autowired
	private IRoleRepository repository;

	@Override
	public Iterable<Role> findAll() {
		// TODO Auto-generated method stub
		return this.repository.findAll();
	}

	@Override
	public Optional<Role> findById(Long id) {
		// TODO Auto-generated method stub
		return this.repository.findById(id);
	}

	@Override
	public Role save(Role t) {
		// TODO Auto-generated method stub
		return this.repository.save(t);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		this.repository.deleteById(id);
	}

	@Override
	public Optional<Role> findRolesByName(String name) {
		// TODO Auto-generated method stub
		return this.repository.findRolesByName(name);
	}
}
