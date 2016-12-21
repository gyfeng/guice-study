package team.study.guice.helloworld;

import com.google.inject.AbstractModule;

/**
 * @author GYFeng by 2016/12/21
 * @version 1.0
 */
public class HelloWorldModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(HelloWorldService.class).to(HelloWorldServiceImpl.class);
    }
}
