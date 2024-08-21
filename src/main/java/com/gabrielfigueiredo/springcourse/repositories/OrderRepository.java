package com.gabrielfigueiredo.springcourse.repositories;

import com.gabrielfigueiredo.springcourse.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
