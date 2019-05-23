package test;

import com.loocc.domain.Account;
import com.loocc.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestSpring {
    @Autowired
    AccountService accountService;
    @Test
    public void test1(){
        List<Account> accounts = accountService.findAll();
        for(Account account:accounts){
            System.out.println(account);
        }
    }
}
