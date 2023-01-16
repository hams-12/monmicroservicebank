package com.hams.mabanquemicroservice.service;

import com.hams.mabanquemicroservice.dto.BankAccountRequestDTO;
import com.hams.mabanquemicroservice.dto.BankAccountResponseDTO;

public interface AccountService {
    public BankAccountResponseDTO addBankAccount(BankAccountRequestDTO bankAccountRequestDTO);
}
