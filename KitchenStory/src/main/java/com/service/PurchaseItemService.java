package com.service;

import java.util.List;

import com.entity.PurchaseItem;
import com.entity.PurchaseOrder;
import com.entity.User;

public interface PurchaseItemService {
	public PurchaseItem getPurchaseItemById(Long id);

	public List<PurchaseItem> getAllItemsByPurchaseOrder(PurchaseOrder order);

	public List<PurchaseItem> getAllPurchaseItemByUserId(User userId);

	public PurchaseItem savePurchaseItem(PurchaseItem purchaseItem);

	public List<PurchaseItem> getAllPurchaseItemList();
}
