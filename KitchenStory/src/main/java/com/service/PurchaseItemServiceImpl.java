package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.dao.PurchaseItemDao;
import com.entity.PurchaseItem;
import com.entity.PurchaseOrder;
import com.entity.User;

@Service(value = "purchaseItemService")
public class PurchaseItemServiceImpl implements PurchaseItemService {

	@Autowired
	PurchaseItemDao purchaseItemDao;
	
	@Override
	public PurchaseItem getPurchaseItemById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PurchaseItem> getAllItemsByPurchaseOrder(PurchaseOrder order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PurchaseItem> getAllPurchaseItemByUserId(User userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PurchaseItem savePurchaseItem(PurchaseItem purchaseItem) {
		purchaseItemDao.save(purchaseItem);
		return purchaseItem;
	}

	@Override
	public List<PurchaseItem> getAllPurchaseItemList() {
		return purchaseItemDao.findAll(Sort.by(Sort.Direction.ASC, "purchaseOrder_ID"));
		
	}
	
}