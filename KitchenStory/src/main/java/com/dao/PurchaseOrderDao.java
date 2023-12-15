package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.PurchaseOrder;

@Repository
public interface PurchaseOrderDao extends JpaRepository<PurchaseOrder, Long> {

}
