package team.study.guice.inject;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author GYFeng by 2016/12/21
 * @version 1.0
 */
class SaleService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SaleService.class);

    private final OrderService orderService;

    /**
     * 这里是类，Guice能自己注入，不需要绑定对象
     *
     * @param orderService 订单服务
     */
    @Inject
    public SaleService(OrderService orderService) {
        this.orderService = orderService;
    }

    void sale(long id) {
        String order = orderService.findOrder(id);
        LOGGER.info("sale order,{}", order);
    }
}
