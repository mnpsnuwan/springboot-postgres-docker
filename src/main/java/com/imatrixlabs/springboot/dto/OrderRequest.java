package com.imatrixlabs.springboot.dto;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * Project : SpringBoot
 * Company : IMATRIXLABS (PVT) LTD. [<a href="https://imatrixlabs.com">...</a>]
 * Class : {@link OrderRequest}
 *
 * @author : Nuwan Samarasinghe [nuwan@imatrixlabs.com]
 */
public record OrderRequest(Long id, String orderNumber, String skuCode, BigDecimal price, Integer quantity)
{
}
