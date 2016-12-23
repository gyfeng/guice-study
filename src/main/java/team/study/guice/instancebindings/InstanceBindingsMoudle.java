package team.study.guice.instancebindings;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * @author GYFeng by 2016/12/23
 * @version 1.0
 */
public class InstanceBindingsMoudle extends AbstractModule {
    @Override
    protected void configure() {
        bind(String.class).annotatedWith(Names.named("JDBC-URL")).toInstance("jdbc:mysql://localhost/pizza");
        bind(Integer.class).annotatedWith(Names.named("time-out")).toInstance(10);
    }
}
