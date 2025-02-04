package be.technifutur.plateformevoisin.repositories.impls;

import be.technifutur.plateformevoisin.entities.Apply;
import be.technifutur.plateformevoisin.repositories.ApplyRepository;

public class ApplyRepositoryImpl extends BaseRepositoryImpl<Apply, Long> implements ApplyRepository {
    protected ApplyRepositoryImpl() {
        super(Apply.class);
    }
}
