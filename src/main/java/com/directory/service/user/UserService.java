package com.directory.service.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.directory.model.entity.User;
import com.directory.repository.IUserRepository;

@Service
public class UserService implements IUserService {
	
	@Autowired
	private IUserRepository userRepository;
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

}
