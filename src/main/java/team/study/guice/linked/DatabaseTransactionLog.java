package team.study.guice.linked;

/**
 * @author GYFeng by 2016/12/22
 * @version 1.0
 */
public class DatabaseTransactionLog implements TransactionLog {
    @Override
    public String log(String info) {
        return String.format("DatabaseTransactionLog:%s", info);
    }
}
