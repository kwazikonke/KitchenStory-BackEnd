package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.PurchaseItem;

@Repository
public interface PurchaseItemDao extends JpaRepository<PurchaseItem, Long>{

}
