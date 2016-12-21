package team.study.guice.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author GYFeng by 2016/12/21
 * @version 1.0
 */
public class HelloWorldServiceImpl implements HelloWorldService {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldServiceImpl.class);

    @Override
    public void output() {
        LOGGER.info("hi {},welcome to guice world!", "soldier");
    }
}
