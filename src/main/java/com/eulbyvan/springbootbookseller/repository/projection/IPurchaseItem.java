package com.eulbyvan.springbootbookseller.repository.projection;

import java.time.LocalDateTime;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 07/12/2022
 */

public interface IPurchaseItem {
    String getTitle();
    Double getPrice();
    LocalDateTime getPurchaseTime();
}
