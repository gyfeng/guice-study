package team.study.guice.providerinterface;


import com.google.inject.Provider;
import team.study.guice.providerannotation.DatabaseTransactionLog;
import team.study.guice.providerannotation.TransactionLog;

/**
 * Created by gyfeng on 16-12-30.
 */
public class DatabaseTransactionLogProvider implements Provider<TransactionLog> {

    @Override
    public TransactionLog get() {
        DatabaseTransactionLog transactionLog = new DatabaseTransactionLog();
        transactionLog.setJdbcUrl("DatabaseTransactionLogProvider");
        transactionLog.setThreadPoolSize(100);
        return transactionLog;
    }
}
