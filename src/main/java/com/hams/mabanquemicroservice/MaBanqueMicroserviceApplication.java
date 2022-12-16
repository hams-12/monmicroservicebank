package com.hams.mabanquemicroservice;

import com.hams.mabanquemicroservice.entities.BankAccount;
import com.hams.mabanquemicroservice.enums.AccoutType;
import com.hams.mabanquemicroservice.repositories.BankAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class MaBanqueMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaBanqueMicroserviceApplication.class, args);
    }
    @Bean
    CommandLineRunner maCommandLineRunner(BankAccountRepository bankAccountRepository){
        return args -> {
            for (int i = 0; i < 10; i++) {
                BankAccount bankAccount = BankAccount.builder()
                        .id(UUID.randomUUID().toString())
                        .createdAt(new Date())
                        .balance(Math.random()*100000)
                        .type(Math.random()>0.5?AccoutType.SAVING_ACCOUNT:AccoutType.CURRENT_ACCOUNT)
                        .build();
                bankAccountRepository.save(bankAccount);
            }
        };
    }

}
