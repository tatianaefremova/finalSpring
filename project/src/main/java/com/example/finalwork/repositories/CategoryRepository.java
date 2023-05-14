package com.example.finalwork.repositories;

import com.example.finalwork.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    com.example.finalwork.models.Category findByName(String name);
}
