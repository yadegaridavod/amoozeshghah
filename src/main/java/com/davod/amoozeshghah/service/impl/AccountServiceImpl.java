package com.davod.amoozeshghah.service.impl;

import com.davod.amoozeshghah.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl {
    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

}