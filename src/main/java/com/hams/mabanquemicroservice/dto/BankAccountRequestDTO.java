package com.hams.mabanquemicroservice.dto;

import com.hams.mabanquemicroservice.enums.AccoutType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class BankAccountRequestDTO {
    private double balance;
    private AccoutType type;
}
