package com.example.apelsin_springboot_3si.service;

import com.example.apelsin_springboot_3si.dto.OrderDTO;
import com.example.apelsin_springboot_3si.entity.Detail;
import com.example.apelsin_springboot_3si.entity.Invoice;
import com.example.apelsin_springboot_3si.entity.Order;
import com.example.apelsin_springboot_3si.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class OrderService {

    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    ProductRepository productRepository;

    @Autowired
    DetailRepository detailRepository;
    @Autowired
    InvoiceRepository invoiceRepository;

    public void add(OrderDTO orderDTO, Model model){
        // zakazni bazaga yozish kerak
        Order order = new Order();
        order.setCustomer(customerRepository.getById(orderDTO.getCustomerId()));
        order.setDate(new Date());
        Order save = orderRepository.save(order);


        Detail detail = new Detail();
        detail.setOrder(save);
        detail.setProduct(productRepository.getById(orderDTO.getProductId()));
        detail.setQuantity(orderDTO.getAmount());
        Detail detail1 = detailRepository.save(detail);


        Invoice invoice = new Invoice();
        invoice.setOrder(save);
        BigDecimal price = detail1.getProduct().getPrice();
        Short quantity = detail1.getQuantity();
        invoice.setAmount(price.multiply(BigDecimal.valueOf(quantity)));
        invoice.setDue(new Date());
        invoiceRepository.save(invoice);
    }


}
