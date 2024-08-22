package com.demo.emazon.domain.api;

import com.demo.emazon.domain.model.Category;
import com.demo.emazon.domain.spi.iCategoryPersistencePort;

import java.util.List;

public interface categoryServicePort {

    void saveCategory (Category category);

    List<Category> getAllCategory();

    iCategoryPersistencePort getCategoryPersistencePort();
}
