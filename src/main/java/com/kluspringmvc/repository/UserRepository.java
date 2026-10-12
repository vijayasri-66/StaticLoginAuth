package com.kluspringmvc.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.kluspringmvc.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
