package com.eulbyvan.springbootbookseller.service;

import com.eulbyvan.springbootbookseller.model.PurchaseHistory;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 07/12/2022
 */

public interface IPurchaseHitoryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);
}
