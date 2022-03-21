package com.traker.task.controllers;

import com.traker.task.models.Category;
import com.traker.task.models.Project;
import com.traker.task.repo.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository repo;

    @GetMapping("/categories")
    public String listCategories(Model model) {
        List<Category> listCategories = repo.findAll();
        model.addAttribute("listCategories", listCategories);
        return "categories";
    }

    @GetMapping("/categories/new")
    public String showCategoryNewForm(Model model) {
        model.addAttribute("category", new Category());
        return "category_form";
    }
    @PostMapping ("/categories/save")
    public String saveCategory(Category category) {
        repo.save(category);
        return "redirect:/categories";
    }

    @GetMapping ("categories/edit/{id}")
    public String ShowEditCategoriesForm(@PathVariable("id") Integer id, Model model) {
        Category category = repo.findById(id).get();
        model.addAttribute("category", category);

        List<Category> listCategories = repo.findAll();
        model.addAttribute("listCategories", listCategories);
        return "category_form";
    }


    @GetMapping ("categories/delete/{id}")
    public String deleteCategories(@PathVariable("id") Integer id, Model model) {
        repo.deleteById(id);
        return "redirect:/categories";
    }


}
