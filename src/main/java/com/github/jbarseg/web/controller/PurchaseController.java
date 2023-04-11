package com.github.jbarseg.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.jbarseg.domain.PurchaseDomain;
import com.github.jbarseg.domain.service.PurchaseService;

@RestController
@RequestMapping("/api/purchases")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("/all")
    public ResponseEntity<List<PurchaseDomain>> getAll(){
        return new ResponseEntity<>(purchaseService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{clientId}")
    public ResponseEntity<List<PurchaseDomain>> getByClient (@PathVariable("clientId") String clientId){
        return purchaseService.getByClient(clientId)
        .map(purchase -> new ResponseEntity<>(purchase, HttpStatus.OK))
        .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<PurchaseDomain> save (PurchaseDomain purchaseDomain){
        return new ResponseEntity<>(purchaseService.save(purchaseDomain), HttpStatus.CREATED);
    }
}
