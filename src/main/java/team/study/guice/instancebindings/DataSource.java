package team.study.guice.instancebindings;

import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * @author GYFeng by 2016/12/23
 * @version 1.0
 */
public class DataSource {
    private final String jdbcUrl;
    private final int timeout;

    @Inject
    public DataSource(@Named("JDBC-URL") String jdbcUrl, @Named("time-out") int timeout) {
        this.jdbcUrl = jdbcUrl;
        this.timeout = timeout;
    }

    public void print() {
        System.out.println("JDBC-URL:" + jdbcUrl);
        System.out.println("TIME-OUT:" + timeout);
    }
}
