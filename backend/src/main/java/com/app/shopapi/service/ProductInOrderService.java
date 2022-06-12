package com.app.shopapi.service;

import com.app.shopapi.entity.ProductInOrder;
import com.app.shopapi.entity.User;

public interface ProductInOrderService {
    void update(String itemId, Integer quantity, User user);
    ProductInOrder findOne(String itemId, User user);
}
