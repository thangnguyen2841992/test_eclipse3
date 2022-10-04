package com.directory.service.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.directory.model.dto.UserPrincipal;
import com.directory.model.entity.Role;
import com.directory.model.entity.User;
import com.directory.repository.IUserRepository;
import com.directory.service.role.IRoleService;

@Service
public class UserService implements IUserService {
	
	@Autowired
	private IUserRepository userRepository;
	
	@Autowired
	private IRoleService roleService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public Iterable<User> findAll() {
		// TODO Auto-generated method stub
		return this.userRepository.findAll();
	}

	@Override
	public Optional<User> findById(Long id) {
		return this.userRepository.findById(id);
	}

	@Override
	public User save(User t) {
		// TODO Auto-generated method stub
		return this.userRepository.save(t);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		this.userRepository.deleteById(id);
	}


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username).get();
        return UserPrincipal.build(user);
    }

    @Override
    public User saveAdmin(User user) {
        Optional<Role> roleOptional = this.roleService.findRolesByName("ROLE_ADMIN");
        List<Role> roles = new ArrayList<>();
        roles.add(new Role(roleOptional.get().getId(), roleOptional.get().getName()));
        String password = user.getPassword();
        String encodedPassword = passwordEncoder.encode(password);
        user.setPassword(encodedPassword);
        user.setRoles(roles);
        user.setAvatar("default-avatar.jpg");
        user.setEmail("admin@gmail.com");
        user.setPhone("0394910426");
        return userRepository.save(user);
    }

    @Override
    public User saveUser(User user) {
        Optional<Role> roleOptional = this.roleService.findRolesByName("ROLE_USER");
        List<Role> roles = new ArrayList<>();
        roles.add(new Role(roleOptional.get().getId(), roleOptional.get().getName()));
        String password = user.getPassword();
        String encodedPassword = passwordEncoder.encode(password);
        user.setPassword(encodedPassword);
        user.setRoles(roles);
        user.setAvatar("default-avatar.jpg");
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return this.userRepository.findByUsername(username);
    }

    @Override
    public Optional<User> findUsersByEmail(String email) {
        return this.userRepository.findUsersByEmail(email);
    }

    @Override
    public Optional<User> findUsersByPhone(String phone) {
        return this.userRepository.findUsersByPhone(phone);
    }



}
