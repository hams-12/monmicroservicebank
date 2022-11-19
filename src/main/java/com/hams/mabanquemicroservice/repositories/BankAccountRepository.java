package com.hams.mabanquemicroservice.repositories;

import com.hams.mabanquemicroservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
}
