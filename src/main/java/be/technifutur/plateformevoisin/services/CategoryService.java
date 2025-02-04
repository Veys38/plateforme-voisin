package be.technifutur.plateformevoisin.services;

import be.technifutur.plateformevoisin.entities.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    Category getCategoryByName(String categoryName);

}
