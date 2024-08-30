package com.imatrixlabs.springboot.controller;

import com.imatrixlabs.springboot.dto.OrderRequest;
import com.imatrixlabs.springboot.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * Project : SpringBoot
 * Company : IMATRIXLABS (PVT) LTD. [<a href="https://imatrixlabs.com">...</a>]
 * Class : {@link OrderController}
 *
 * @author : Nuwan Samarasinghe [nuwan@imatrixlabs.com]
 */

@RestController
@RequestMapping( "/api/order" )
@RequiredArgsConstructor
public class OrderController
{
    private final OrderService orderService;

    @PostMapping
    @ResponseStatus( HttpStatus.CREATED )
    public String placeOrder( @RequestBody OrderRequest orderRequest )
    {
        orderService.placeOrder( orderRequest );
        return "Order Placed Successfully";
    }
}
