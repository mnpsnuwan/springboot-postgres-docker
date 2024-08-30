package com.imatrixlabs.springboot.repository;

import com.imatrixlabs.springboot.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : SpringBoot
 * Company : IMATRIXLABS (PVT) LTD. [<a href="https://imatrixlabs.com">...</a>]
 * Class : {@link OrderRepository}
 *
 * @author : Nuwan Samarasinghe [nuwan@imatrixlabs.com]
 */
public interface OrderRepository extends JpaRepository<Order,Long>
{
}
