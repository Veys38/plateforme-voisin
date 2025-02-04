package be.technifutur.plateformevoisin.services;

import be.technifutur.plateformevoisin.entities.Task;

import java.util.List;

public interface TaskService {

    List<Task> findAll();
    Task findBytitle(String title);
    Task save(Task task);
    void update(Task task);
    void delete(Task task);
}
