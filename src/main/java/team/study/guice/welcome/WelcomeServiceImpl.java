package team.study.guice.welcome;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author GYFeng by 2016/12/21
 * @version 1.0
 */
public class WelcomeServiceImpl implements WelcomeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(WelcomeServiceImpl.class);

    @Override
    public void welcome(String yourName) {
        LOGGER.info("hi {},welcome to guice world!", yourName);
    }
}
