package com.projects.Task_Springboot.repository;

import java.util.List;

import com.projects.Task_Springboot.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

	List<Task> findByCategory(String category);

	//List<Task> findByCategoryAndPriority(String category, String priority);

	List<Task> findByPriority(String priority);

	List<Task> findByTitleContainingIgnoreCase(String query);

}
