package team.study.guice.instancebindings;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

/**
 * @author GYFeng by 2016/12/23
 * @version 1.0
 */
public class InstanceBindingsTest {
    @Test
    public void testInstanceBindings() {
        Injector injector = Guice.createInjector(new InstanceBindingsMoudle());
        DataSource dataSource = injector.getInstance(DataSource.class);
        dataSource.print();
    }
}
