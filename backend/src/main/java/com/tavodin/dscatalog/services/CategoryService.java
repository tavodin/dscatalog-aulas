package com.tavodin.dscatalog.services;

import com.tavodin.dscatalog.repositories.CategoryRepository;
import com.tavodin.dscatalog.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

}
