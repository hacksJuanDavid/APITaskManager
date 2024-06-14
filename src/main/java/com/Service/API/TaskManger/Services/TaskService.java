package com.Service.API.TaskManger.Services;

import com.Service.API.TaskManger.Entity.TaskEntity;
import com.Service.API.TaskManger.Repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    // Inject TaskRepository
    @Autowired
    private TaskRepository taskRepository;
    
    // Get all tasks
    public List<TaskEntity> getAllTasks() {
        return taskRepository.findAll();
    }
    
    // Get task by id
    public TaskEntity getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }
    
    // Add task
    public void addTask(TaskEntity task) {
        taskRepository.save(task);
    }
    
    // Update task
    public TaskEntity updateTask(TaskEntity task) {
        return taskRepository.save(task);
    }
    
    // Delete task
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
