package com.app.shopapi.repository;

import com.app.shopapi.entity.ProductInOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInOrderRepository extends JpaRepository<ProductInOrder, Long> {

}
