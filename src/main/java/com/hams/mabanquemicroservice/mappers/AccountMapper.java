package com.hams.mabanquemicroservice.mappers;

import com.hams.mabanquemicroservice.dto.BankAccountResponseDTO;
import com.hams.mabanquemicroservice.entities.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public BankAccountResponseDTO fromBankAccount(BankAccount bankAccount){
        BankAccountResponseDTO bankAccountResponseDTO = new BankAccountResponseDTO();
        BeanUtils.copyProperties(bankAccount,bankAccountResponseDTO); //on met l'objet BankAccount dans un objet de type BankAccountResponseDTO
        return bankAccountResponseDTO;
    }
}
