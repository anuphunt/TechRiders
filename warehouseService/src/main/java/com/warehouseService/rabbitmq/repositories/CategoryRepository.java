package com.warehouseService.rabbitmq.repositories;


import com.warehouseService.rabbitmq.domains.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends CrudRepository<Category,Integer> {

    
}
