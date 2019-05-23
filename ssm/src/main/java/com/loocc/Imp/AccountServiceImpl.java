package com.loocc.Imp;

import com.loocc.dao.AccountDao;
import com.loocc.domain.Account;
import com.loocc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    protected AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户、、、");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户、、、");
        accountDao.saveAccount(account);
    }
}
