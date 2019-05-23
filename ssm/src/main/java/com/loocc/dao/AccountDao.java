package com.loocc.dao;

import com.loocc.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户接口
 */

public interface AccountDao {
    //查询所有
   @Select("select * from account")
    List<Account> findAll();

    //保存账户
    @Insert("insert into account (uid,money) values(#{uid},#{money})")
    void saveAccount(Account account);
}
