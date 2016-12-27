package team.study.guice.inject;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

/**
 * @author GYFeng by 2016/12/21
 * @version 1.0
 */
public class OrderServiceTest {

    @Test
    public void testSale() {
        Injector injector = Guice.createInjector(new OrderModule());
        SaleService instance = injector.getInstance(SaleService.class);
        instance.sale(1L);
    }
}
