package com.app.shopapi.service;

import com.app.shopapi.entity.Cart;
import com.app.shopapi.entity.ProductInOrder;
import com.app.shopapi.entity.User;

import java.util.Collection;

public interface CartService {
    Cart getCart(User user);

    void mergeLocalCart(Collection<ProductInOrder> productInOrders, User user);

    void delete(String itemId, User user);

    void checkout(User user);
}
