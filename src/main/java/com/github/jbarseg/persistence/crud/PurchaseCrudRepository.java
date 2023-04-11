package com.github.jbarseg.persistence.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.github.jbarseg.persistence.entity.Purchase;



public interface PurchaseCrudRepository extends CrudRepository<Purchase, Integer>{

    Optional<List<Purchase>> findByIdClient (String idClient);

}
