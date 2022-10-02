package com.directory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.directory.model.entity.User;

public interface IUserRepository extends JpaRepository<User, Long> {

}
