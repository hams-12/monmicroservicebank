package com.hams.mabanquemicroservice.repositories;

import com.hams.mabanquemicroservice.entities.BankAccount;
import com.hams.mabanquemicroservice.enums.AccoutType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
    List<BankAccount> findByType(AccoutType type);
}
