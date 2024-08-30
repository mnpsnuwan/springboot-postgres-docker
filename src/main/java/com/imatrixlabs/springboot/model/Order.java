package com.imatrixlabs.springboot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * Project : SpringBoot
 * Company : IMATRIXLABS (PVT) LTD. [<a href="https://imatrixlabs.com">...</a>]
 * Class : {@link Order}
 *
 * @author : Nuwan Samarasinghe [nuwan@imatrixlabs.com]
 */

@Entity
@Table( name = "t_orders" )
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order
{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    private String orderNumber;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
