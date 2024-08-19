package com.gabrielfigueiredo.springcourse.repositories;

import com.gabrielfigueiredo.springcourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
