package com.imatrixlabs.springboot.service;

import com.imatrixlabs.springboot.dto.OrderRequest;
import com.imatrixlabs.springboot.model.Order;
import com.imatrixlabs.springboot.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Project : SpringBoot
 * Company : IMATRIXLABS (PVT) LTD. [<a href="https://imatrixlabs.com">...</a>]
 * Class : {@link OrderService}
 *
 * @author : Nuwan Samarasinghe [nuwan@imatrixlabs.com]
 */

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService
{
    private final OrderRepository orderRepository;

    public void placeOrder( OrderRequest orderRequest )
    {
        // map OrderRequest to Order Object
        Order order = new Order();
        order.setOrderNumber( UUID.randomUUID().toString() );
        order.setSkuCode( orderRequest.skuCode() );
        order.setPrice( orderRequest.price() );
        order.setQuantity( orderRequest.quantity() );

        // Save order to Order Repository
        orderRepository.save( order );
        log.info( "Order placed successfully" );
    }
}
