package com.example.demo.services;

import com.example.demo.domain.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TaskServiceImpl implements TaskService {

    private Map<Integer, Task> tasks;

    public TaskServiceImpl(){
        loadTasks();
    }

    @Override
    public List<Task> listAllTasks() {
        return new ArrayList<>(tasks.values());
    }


    private void loadTasks(){
        tasks = new HashMap<>();

        Task task1 = new Task();
        task1.setId(1);
        task1.setDescription("aaa");

        tasks.put(1, task1);
    }
}
