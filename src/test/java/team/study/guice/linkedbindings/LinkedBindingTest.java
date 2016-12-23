package team.study.guice.linkedbindings;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Assert;
import org.junit.Test;

/**
 * Guice中的bean可级联定义，看最后绑定在哪一个类上，最后就返回哪个类的实例
 *
 * @author GYFeng by 2016/12/22
 * @version 1.0
 */
public class LinkedBindingTest {

    @Test
    public void testNosubType() {
        Injector injector = Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                bind(TransactionLog.class).to(DatabaseTransactionLog.class);
            }
        });
        TransactionLog transactionLog = injector.getInstance(TransactionLog.class);
        String msg = transactionLog.log("msg");
        Assert.assertEquals("DatabaseTransactionLog:msg", msg);
        Assert.assertEquals(DatabaseTransactionLog.class, transactionLog.getClass());
    }

    @Test
    public void testSubType() {
        Injector injector = Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                bind(TransactionLog.class).to(DatabaseTransactionLog.class);
                bind(DatabaseTransactionLog.class).to(MySqlDatabaseTransactionLog.class);
            }
        });
        TransactionLog transactionLog = injector.getInstance(TransactionLog.class);
        String msg = transactionLog.log("msg");
        Assert.assertEquals("MySqlDatabaseTransactionLog:msg", msg);
        Assert.assertEquals(MySqlDatabaseTransactionLog.class, transactionLog.getClass());

        transactionLog = injector.getInstance(DatabaseTransactionLog.class);
        msg = transactionLog.log("info");
        Assert.assertEquals("MySqlDatabaseTransactionLog:info", msg);
        Assert.assertEquals(MySqlDatabaseTransactionLog.class, transactionLog.getClass());
    }
}
