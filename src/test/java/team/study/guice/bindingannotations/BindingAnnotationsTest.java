package team.study.guice.bindingannotations;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

/**
 * @author GYFeng by 2016/12/23
 * @version 1.0
 */
public class BindingAnnotationsTest {

    @Test
    public void testBindingAnnotations() {
        Injector injector = Guice.createInjector(new BindingAnnotationsModule());
        BusinessService businessService = injector.getInstance(BusinessService.class);
        businessService.process();
    }
}
