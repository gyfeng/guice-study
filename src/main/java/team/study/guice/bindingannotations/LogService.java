package team.study.guice.bindingannotations;

/**
 * @author GYFeng by 2016/12/23
 * @version 1.0
 */
public interface LogService {
    /**
     * 记录日志
     *
     * @param msg 日志消息
     */
    void log(String msg);
}
