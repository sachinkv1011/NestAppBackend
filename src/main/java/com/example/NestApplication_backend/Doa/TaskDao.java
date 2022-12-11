package com.example.NestApplication_backend.Doa;

import com.example.NestApplication_backend.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskDao extends CrudRepository<Task,Integer> {
}
