package com.github.jbarseg.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.github.jbarseg.domain.PurchaseDomain;
import com.github.jbarseg.domain.repository.PurchaseRepository;
import com.github.jbarseg.persistence.crud.PurchaseCrudRepository;
import com.github.jbarseg.persistence.entity.Purchase;
import com.github.jbarseg.persistence.mapper.PurchaseMapper;

@Repository
public class CompraRepository implements PurchaseRepository {

    @Autowired
    private PurchaseCrudRepository purchaseCrudRepository;

    @Autowired
    private PurchaseMapper purchaseMapper;

    @Override
    public List<PurchaseDomain> getAll() {
        return purchaseMapper.toPurchasesDomain((List <Purchase>) purchaseCrudRepository.findAll());
    }

    @Override
    public Optional<List<PurchaseDomain>> getByClient(String clientId) {
        return purchaseCrudRepository.findByIdClient(clientId).map(purchases -> purchaseMapper.toPurchasesDomain(purchases));
    }

    @Override
    public PurchaseDomain save(PurchaseDomain purchaseDomain) {
        Purchase purchase = purchaseMapper.toPurchase(purchaseDomain);
        purchase.getProducts().forEach(product -> product.setPurchase(purchase));
        return purchaseMapper.toPurchaseDomain(purchaseCrudRepository.save(purchase));
    }
}
