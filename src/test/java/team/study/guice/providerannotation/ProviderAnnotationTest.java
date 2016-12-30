package team.study.guice.providerannotation;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

/**
 * Created by gyfeng on 16-12-30.
 */
public class ProviderAnnotationTest {
    @Test
    public void testProviderAnnotation() {
        Injector injector = Guice.createInjector(new BillingModule());
        TransactionLog transactionLog = injector.getInstance(TransactionLog.class);
        System.out.println(transactionLog.getJdbcUrl());
        System.out.println(transactionLog.getThreadPoolSize());
    }
}
