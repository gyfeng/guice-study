package team.study.guice.linkedbindings;

/**
 * @author GYFeng by 2016/12/22
 * @version 1.0
 */
public class MySqlDatabaseTransactionLog extends DatabaseTransactionLog {

    @Override
    public String log(String info) {
        return String.format("MySqlDatabaseTransactionLog:%s", info);
    }
}
