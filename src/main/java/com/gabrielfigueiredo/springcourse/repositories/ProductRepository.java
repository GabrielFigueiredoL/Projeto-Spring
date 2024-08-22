package com.gabrielfigueiredo.springcourse.repositories;

import com.gabrielfigueiredo.springcourse.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
