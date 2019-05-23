package com.loocc.service;

import com.loocc.domain.Account;

import java.util.List;

public interface AccountService {
    //查询所有
    List<Account> findAll();

    //保存账户
    void saveAccount(Account account);
}
