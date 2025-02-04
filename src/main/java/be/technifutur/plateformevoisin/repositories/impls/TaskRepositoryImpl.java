package be.technifutur.plateformevoisin.repositories.impls;

import be.technifutur.plateformevoisin.entities.Task;
import be.technifutur.plateformevoisin.repositories.TaskRepository;

public class TaskRepositoryImpl extends BaseRepositoryImpl<Task, Long> implements TaskRepository {

    protected TaskRepositoryImpl(Class<Task> taskClass) {
        super(taskClass);
    }
}
