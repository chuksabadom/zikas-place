package com.chuksabadom.zikasplace.repository;

import com.chuksabadom.zikasplace.entity.MaterialCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "materialCategory", path = "material-category")
public interface MaterialCategoryRepository extends JpaRepository<MaterialCategory, Long> {
}
