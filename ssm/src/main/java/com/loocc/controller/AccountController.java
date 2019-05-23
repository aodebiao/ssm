package com.loocc.controller;

import com.loocc.domain.Account;
import com.loocc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(path = "/testFindAll")
    public String testFindAll(Model model) {
        System.out.println("表现层查询所有的账户信息");
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping(path = "/testSaveAccount")
    public String testSaveAccount(Account account) {
        System.out.println("表现层查询所有的账户信息");
        accountService.saveAccount(account);
        return "list";
    }

}
