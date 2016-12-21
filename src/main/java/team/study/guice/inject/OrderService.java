package team.study.guice.inject;

/**
 * 包私有的情况下Guice也能够实例化注入
 *
 * @author GYFeng by 2016/12/21
 * @version 1.0
 */
class OrderService {

    String findOrder(long id) {
        return "order:id:" + id;
    }
}
