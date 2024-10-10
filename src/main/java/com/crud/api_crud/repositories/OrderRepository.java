package com.crud.api_crud.repositories;

import com.crud.api_crud.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
