package team.study.guice.providerinterface;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;
import team.study.guice.providerannotation.TransactionLog;

/**
 * Created by gyfeng on 16-12-30.
 */
public class ProviderInterfaceModuleTest {

    @Test
    public void testProviderInterface() {
        Injector injector = Guice.createInjector(new ProviderInterfaceModule());
        TransactionLog transactionLog = injector.getInstance(TransactionLog.class);
        System.out.println(transactionLog.getJdbcUrl());
        System.out.println(transactionLog.getThreadPoolSize());
    }
}
