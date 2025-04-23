package com.example.demo.services;

import com.example.demo.dao.CartItemRepository;
import com.example.demo.dao.CartRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Cart;
import com.example.demo.entities.CartItem;
import com.example.demo.entities.Division;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import static com.example.demo.entities.StatusType.*;

@Service
public class CheckoutServiceImpl implements CheckoutService{
    private CartRepository cartRepository;
    private CartItemRepository cartItemRepository;
    private String generateOrderTrackingNumber() {
        return UUID.randomUUID().toString();
    }
    @Autowired
    public CheckoutServiceImpl(CartRepository cartRepository){
        this.cartRepository = cartRepository;
    }
    public CheckoutServiceImpl(CartItemRepository cartItemRepository) {this.cartItemRepository = cartItemRepository;}

    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {
        Cart cart = purchase.getCart();
        cart.setStatus(ordered);
        String orderTrackingNumber = generateOrderTrackingNumber();
        cart.setOrderTrackingNumber(orderTrackingNumber);
        Set<CartItem> cartItems = purchase.getCartItems();
        cartItems.forEach(item -> cart.add(item));
        cartRepository.save(cart);
        return new PurchaseResponse(orderTrackingNumber);
    }
}
