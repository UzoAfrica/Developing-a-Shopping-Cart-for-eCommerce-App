package com.ecommerce.controller;

import com.ecommerce.model.Category;
import com.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")

public class CategoryController {

    @Autowired
    CategoryService categoryService;

    public String createCategory(@RequestBody Category category){
        categoryService.createCategory(category);
        return "success";
    }
}
