package team.study.guice.inject;

import com.google.inject.Binder;
import com.google.inject.Module;

/**
 * Guice如果是类的时候，不用绑定都可以直接依赖？？
 *
 * @author GYFeng by 2016/12/21
 * @version 1.0
 */
public class OrderModule implements Module {

    @Override
    public void configure(Binder binder) {
        // 什么都不需要做，声明一个空的module方法
    }
}
