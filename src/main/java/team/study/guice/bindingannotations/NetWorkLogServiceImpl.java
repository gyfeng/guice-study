package team.study.guice.bindingannotations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author GYFeng by 2016/12/23
 * @version 1.0
 */
public class NetWorkLogServiceImpl implements LogService {

    public static final Logger LOGGER = LoggerFactory.getLogger(NetWorkLogServiceImpl.class);

    @Override
    public void log(String msg) {
        LOGGER.info("network log service log,msg is {}", msg);
    }
}
