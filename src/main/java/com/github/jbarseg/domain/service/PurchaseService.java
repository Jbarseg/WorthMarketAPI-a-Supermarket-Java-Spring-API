package com.github.jbarseg.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.jbarseg.domain.PurchaseDomain;
import com.github.jbarseg.domain.repository.PurchaseRepository;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<PurchaseDomain> getAll(){
        return purchaseRepository.getAll();
    }

    public Optional<List<PurchaseDomain>> getByClient (String clientId){
        return purchaseRepository.getByClient(clientId);
    }

    public PurchaseDomain save (PurchaseDomain purchaseDomain){
        return purchaseRepository.save(purchaseDomain);
    }
}
