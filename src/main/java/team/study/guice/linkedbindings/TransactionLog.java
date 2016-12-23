package team.study.guice.linkedbindings;

/**
 * 日志记录
 *
 * @author GYFeng by 2016/12/22
 * @version 1.0
 */
public interface TransactionLog {
    /**
     * 记录并返回日志
     *
     * @param info 日志信息
     * @return 记录的日志
     */
    String log(String info);
}
