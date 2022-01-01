package com.d2d.account.service;

import com.d2d.account.entity.Account;
import com.d2d.account.repo.AccountRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class AccountService {

    private AccountRepo accountRepo;

    public Long registerCustomer(String customerName){
        var account = new Account();
        account.setCustomerName(customerName);
        var savedAccount = accountRepo.save(account);
        return savedAccount.getId();
    }
}
