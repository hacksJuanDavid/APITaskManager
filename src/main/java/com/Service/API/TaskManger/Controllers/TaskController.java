package com.Service.API.TaskManger.Controllers;

import com.Service.API.TaskManger.Entity.TaskEntity;
import com.Service.API.TaskManger.Services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tasks")
public class TaskController {
    // Inject TaskService
    @Autowired
    private TaskService taskService;

    // Get all tasks
    @GetMapping
    public List<TaskEntity> getAllTasks() {
        return taskService.getAllTasks();
    }

    // Get task by id
    @GetMapping("/{id}")
    public TaskEntity getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    // Add task
    @PostMapping
    public void addTask(@RequestBody TaskEntity task) {
        taskService.addTask(task);
    }

    // Update task
    @PutMapping("/{id}")
    public TaskEntity updateTask(@RequestBody TaskEntity task, @PathVariable Long id) {
        task.setId(id);
        return taskService.updateTask(task);
    }

    // Delete task
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
}
