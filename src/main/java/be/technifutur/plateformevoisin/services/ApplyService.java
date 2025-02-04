package be.technifutur.plateformevoisin.services;

import be.technifutur.plateformevoisin.entities.Apply;

public interface ApplyService {
    Apply save(Apply apply);
    Apply update(Apply apply);
    Apply delete(Apply apply);
}
