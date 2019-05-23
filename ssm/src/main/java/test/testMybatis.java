package test;

import com.loocc.dao.AccountDao;
import com.loocc.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class testMybatis {
    @Test
    public void test1() throws Exception {
        //加载mybatis的配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = factory.openSession();
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        List<Account> accounts = accountDao.findAll();
        sqlSession.close();
        in.close();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    @Test
    public void testSave() throws Exception {
        //加载mybatis的配置文件,需要手动提交事务
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = factory.openSession();
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        Account account = new Account();
        account.setMoney(200D);
        account.setUid(17);
        accountDao.saveAccount(account);
        sqlSession.commit();
        sqlSession.close();
        in.close();

    }


}
