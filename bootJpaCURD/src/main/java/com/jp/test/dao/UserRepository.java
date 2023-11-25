package com.jp.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.jp.test.entities.User;




public interface UserRepository extends CrudRepository<User, Integer>{
	

}
