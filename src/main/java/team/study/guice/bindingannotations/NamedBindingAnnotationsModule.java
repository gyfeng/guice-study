package team.study.guice.bindingannotations;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * @author GYFeng by 2016/12/23
 * @version 1.0
 */
public class NamedBindingAnnotationsModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(LogService.class).annotatedWith(Names.named("fileLog")).to(FileLogServiceImpl.class);
        bind(LogService.class).annotatedWith(Names.named("networkLog")).to(NetWorkLogServiceImpl.class);
    }
}
