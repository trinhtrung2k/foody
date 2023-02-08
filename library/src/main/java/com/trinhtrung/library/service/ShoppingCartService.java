package com.trinhtrung.library.service;

import com.trinhtrung.library.model.Customer;
import com.trinhtrung.library.model.Product;
import com.trinhtrung.library.model.ShoppingCart;

public interface ShoppingCartService {
    ShoppingCart addItemToCart(Product product, int quantity, Customer customer);

    ShoppingCart updateItemInCart(Product product, int quantity, Customer customer);

    ShoppingCart deleteItemFromCart(Product product, Customer customer);

}