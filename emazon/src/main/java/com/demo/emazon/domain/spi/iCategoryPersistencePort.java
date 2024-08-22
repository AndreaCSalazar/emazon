package com.demo.emazon.domain.spi;

import com.demo.emazon.domain.model.Category;

import java.util.List;

public interface iCategoryPersistencePort {

    void saveCategory (Category category);

    List <Category> getAllCategory();
}
