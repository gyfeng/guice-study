package team.study.guice.welcome;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 简单的测试Guice的模块，模块中简单的实例化一个组件，打印输出一段字符！
 *
 * @author GYFeng by 2016/12/21
 * @version 1.0
 */
public class WelcomeServiceImplTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(WelcomeServiceImplTest.class);

    /**
     * 测试Welcome模块中welcome方法，打印输出正确的字符串信息
     */
    @Test
    public void testWelcome() {
        Injector injector = Guice.createInjector(new WelcomeModule());
        WelcomeService welcomeService = injector.getInstance(WelcomeService.class);

        String welcomeString = welcomeService.welcome("soldier");
        Assert.assertEquals("hi soldier,welcome to guice world!", welcomeString);
        LOGGER.info(welcomeString);

        welcomeString = welcomeService.welcome("coder");
        Assert.assertEquals("hi coder,welcome to guice world!", welcomeString);
        LOGGER.info(welcomeString);
    }
}
