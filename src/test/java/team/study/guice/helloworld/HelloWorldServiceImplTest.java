package team.study.guice.helloworld;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

/**
 * @author GYFeng by 2016/12/21
 * @version 1.0
 */
public class HelloWorldServiceImplTest {

    @Test
    public void testOutput() {
        Injector injector = Guice.createInjector(new HelloWorldModule());
        HelloWorldService helloWorldService = injector.getInstance(HelloWorldService.class);
        helloWorldService.output();
    }
}
