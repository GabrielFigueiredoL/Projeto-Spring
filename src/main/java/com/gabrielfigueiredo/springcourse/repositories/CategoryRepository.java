package com.gabrielfigueiredo.springcourse.repositories;

import com.gabrielfigueiredo.springcourse.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
