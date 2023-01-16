package com.hams.mabanquemicroservice.service;

import com.hams.mabanquemicroservice.dto.BankAccountRequestDTO;
import com.hams.mabanquemicroservice.dto.BankAccountResponseDTO;
import com.hams.mabanquemicroservice.entities.BankAccount;
import com.hams.mabanquemicroservice.enums.AccoutType;
import com.hams.mabanquemicroservice.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.rmi.server.UID;
import java.util.Date;
import java.util.UUID;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

    @Autowired
    private BankAccountRepository bankAccountRepository;
    @Override
    public BankAccountResponseDTO addBankAccount(BankAccountRequestDTO bankAccountRequestDTO) {
        BankAccount bankAccount = BankAccount.builder()
                .id(UUID.randomUUID().toString())
                .createdAt(new Date())
                .type(bankAccountRequestDTO.getType())
                .balance(bankAccountRequestDTO.getBalance())
                .build();

        BankAccount savedBank = bankAccountRepository.save(bankAccount); //C'est cette ligne seulement qui concerne le service. Le reste doit etre fait dans un mapper

        //Le code ci dessous doit être fait dans un mapper normalement
        BankAccountResponseDTO bankAccountResponseDTO = BankAccountResponseDTO.builder()
                .id(savedBank.getId())
                .balance(savedBank.getBalance())
                .createdAt(savedBank.getCreatedAt())
                .type(savedBank.getType())
                .build();


        return bankAccountResponseDTO;
    }
}
