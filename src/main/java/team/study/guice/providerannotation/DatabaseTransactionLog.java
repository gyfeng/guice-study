package team.study.guice.providerannotation;

/**
 * Created by gyfeng on 16-12-30.
 */
public class DatabaseTransactionLog implements TransactionLog {

    private String jdbcUrl;
    private int threadPoolSize;

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    public void setThreadPoolSize(int threadPoolSize) {
        this.threadPoolSize = threadPoolSize;
    }

    @Override
    public String getJdbcUrl() {
        return jdbcUrl;
    }

    @Override
    public int getThreadPoolSize() {
        return threadPoolSize;
    }
}
