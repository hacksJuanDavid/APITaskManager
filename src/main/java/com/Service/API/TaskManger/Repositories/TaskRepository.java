package com.Service.API.TaskManger.Repositories;

import com.Service.API.TaskManger.Entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Long>{
    
}
