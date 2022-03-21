package com.traker.task.controllers;

import com.traker.task.models.Category;
import com.traker.task.models.Project;
import com.traker.task.repo.CategoryRepository;
import com.traker.task.repo.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepo;
    @Autowired
    private CategoryRepository categoryRepo;

    @GetMapping("/project/new")
    public String shoeNewProjectForm(Model model) {
        List<Category> listCategories = categoryRepo.findAll();
        model.addAttribute("project", new Project());
       model.addAttribute("listCategories", listCategories);
                return "project_form";
    }

    @PostMapping("/project/save")
    public String saveProduct(Project project) {
        projectRepo.save(project);
        return "redirect:/project";
    }

    @GetMapping ("/project")
    public String listProject(Model model) {
        List<Project> listProject = projectRepo.findAll();
        model.addAttribute("listProject", listProject);
                return "project";
    }

    @GetMapping ("project/edit/{id}")
    public String ShowEditProjectForm(@PathVariable("id") Integer id, Model model) {
        Project project = projectRepo.findById(id).get();
       model.addAttribute("project", project);

        List<Category> listCategories = categoryRepo.findAll();
        model.addAttribute("listCategories", listCategories);
        return "project_form";
    }


    @GetMapping ("project/delete/{id}")
    public String deleteProject(@PathVariable("id") Integer id, Model model) {
        projectRepo.deleteById(id);
        return "redirect:/project";
    }


}
