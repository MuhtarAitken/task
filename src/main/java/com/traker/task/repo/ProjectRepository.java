package com.traker.task.repo;

import com.traker.task.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer>{
}
