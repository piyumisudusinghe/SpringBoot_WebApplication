package com.boot.repository;

import com.boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/*Jparepository simplifies the process for both relational and non relational databases
JPA is the specification and hibernate is the implementation
JPA is the dance and Hibernate is the dancer*/

public interface UserRepository  extends JpaRepository<User, Integer> {

}
