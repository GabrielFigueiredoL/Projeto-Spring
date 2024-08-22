package com.gabrielfigueiredo.springcourse.repositories;

import com.gabrielfigueiredo.springcourse.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
