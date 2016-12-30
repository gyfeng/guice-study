package team.study.guice.providerannotation;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

/**
 * Created by gyfeng on 16-12-30.
 */
public class BillingModule extends AbstractModule {
    @Override
    protected void configure() {

    }

    @Provides
    TransactionLog provideTransactionLog() {
        DatabaseTransactionLog transactionLog = new DatabaseTransactionLog();
        transactionLog.setJdbcUrl("jdbc:mysql://localhost/pizza");
        transactionLog.setThreadPoolSize(30);
        return transactionLog;
    }

}
