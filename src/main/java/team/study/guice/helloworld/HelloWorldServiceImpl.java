package team.study.guice.helloworld;

/**
 * @author GYFeng by 2016/12/21
 * @version 1.0
 */
public class HelloWorldServiceImpl implements HelloWorldService {

    @Override
    public void output() {
        System.out.println("hello world!guice!");
    }
}
