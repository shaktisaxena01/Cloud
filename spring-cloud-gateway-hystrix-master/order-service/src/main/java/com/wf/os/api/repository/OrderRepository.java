package com.wf.os.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wf.os.api.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
