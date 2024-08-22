package com.demo.emazon.domain.useCase;

import com.demo.emazon.domain.api.categoryServicePort;
import com.demo.emazon.domain.model.Category;
import com.demo.emazon.domain.spi.iCategoryPersistencePort;

import java.util.List;

public abstract class CategoryUseCase implements categoryServicePort {

    private final iCategoryPersistencePort categoryPersistencePort;

    public CategoryUseCase(iCategoryPersistencePort categoryPersistencePort){
        this.categoryPersistencePort= categoryPersistencePort;
    }

    @Override
    public void saveCategory(Category category){
        categoryPersistencePort.saveCategory(category);
    }

    @Override
    public List<Category> getAllCategory() {
        return categoryPersistencePort.getAllCategory();
    }
}
