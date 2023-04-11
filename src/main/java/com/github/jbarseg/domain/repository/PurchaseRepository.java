package com.github.jbarseg.domain.repository;

import java.util.List;
import java.util.Optional;

import com.github.jbarseg.domain.PurchaseDomain;

public interface PurchaseRepository {
    List<PurchaseDomain> getAll();
    Optional<List<PurchaseDomain>> getByClient (String clientId);
    PurchaseDomain save (PurchaseDomain purchaseDomain);
}
