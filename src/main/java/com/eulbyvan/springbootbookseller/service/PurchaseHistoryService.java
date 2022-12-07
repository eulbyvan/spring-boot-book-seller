package com.eulbyvan.springbootbookseller.service;

import com.eulbyvan.springbootbookseller.model.PurchaseHistory;
import com.eulbyvan.springbootbookseller.repository.IPurchaseRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 07/12/2022
 */

@Service
public class PurchaseHistoryService implements IPurchaseHitoryService{
    private IPurchaseRepository purchaseRepository;

    public PurchaseHistoryService(IPurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    @Override
    public PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory) {
        purchaseHistory.setPurchaseTime(LocalDateTime.now());
        return purchaseRepository.save(purchaseHistory);
    }

    public List<PurchaseHistory> findPurchaseItemsOfUser(Long userId) {
        return purchaseRepository.findAllPurchaseOfUser(userId);
    }
}
