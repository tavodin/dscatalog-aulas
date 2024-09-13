package com.tavodin.dscatalog.repositories;

import com.tavodin.dscatalog.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
