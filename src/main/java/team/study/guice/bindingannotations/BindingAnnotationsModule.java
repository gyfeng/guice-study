package team.study.guice.bindingannotations;

import com.google.inject.AbstractModule;

/**
 * @author GYFeng by 2016/12/23
 * @version 1.0
 */
public class BindingAnnotationsModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(LogService.class).annotatedWith(FileLog.class).to(FileLogServiceImpl.class);
        bind(LogService.class).annotatedWith(NetWorkLog.class).to(NetWorkLogServiceImpl.class);
    }
}
