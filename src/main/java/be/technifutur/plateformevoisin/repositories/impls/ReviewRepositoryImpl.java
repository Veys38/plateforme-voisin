package be.technifutur.plateformevoisin.repositories.impls;

import be.technifutur.plateformevoisin.entities.Review;
import be.technifutur.plateformevoisin.repositories.ReviewRepository;


public class ReviewRepositoryImpl extends BaseRepositoryImpl<Review, Long> implements ReviewRepository {

    protected ReviewRepositoryImpl(Class<Review> reviewClass) {
        super(reviewClass);
    }
}
