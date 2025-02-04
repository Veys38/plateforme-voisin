package be.technifutur.plateformevoisin.services;

import be.technifutur.plateformevoisin.entities.Review;

import java.util.List;

public interface ReviewService {
    Review findByUserId(Long userId);
    Review findByUserName(String firstName, String lastName);
    Review save(Review review);
    Review update(Review review);
    void delete(Review review);
}
