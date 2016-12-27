package team.study.guice.bindingannotations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author GYFeng by 2016/12/23
 * @version 1.0
 */
public class FileLogServiceImpl implements LogService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FileLogServiceImpl.class);

    @Override
    public void log(String msg) {
        LOGGER.info("file log service log,msg is {}", msg);
    }
}
