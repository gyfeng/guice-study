package team.study.guice.welcome;

import com.google.inject.AbstractModule;

/**
 * @author GYFeng by 2016/12/21
 * @version 1.0
 */
public class WelcomeModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(WelcomeService.class).to(WelcomeServiceImpl.class);
    }
}
