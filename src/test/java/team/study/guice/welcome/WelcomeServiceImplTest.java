package team.study.guice.welcome;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

/**
 * 简单的测试Guice的模块，模块中简单的实例化一个组件，打印输出一段字符！
 *
 * @author GYFeng by 2016/12/21
 * @version 1.0
 */
public class WelcomeServiceImplTest {

    @Test
    public void testWelcome() {
        Injector injector = Guice.createInjector(new WelcomeModule());
        WelcomeService welcomeService = injector.getInstance(WelcomeService.class);
        welcomeService.welcome("soldier");
    }
}
