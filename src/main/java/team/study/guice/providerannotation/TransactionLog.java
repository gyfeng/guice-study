package team.study.guice.providerannotation;

/**
 * Created by gyfeng on 16-12-30.
 */
public interface TransactionLog {
    String getJdbcUrl();

    int getThreadPoolSize();
}
