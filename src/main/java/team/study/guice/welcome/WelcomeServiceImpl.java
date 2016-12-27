package team.study.guice.welcome;

/**
 * 输出欢迎字符！
 *
 * @author GYFeng by 2016/12/21
 * @version 1.0
 */
public class WelcomeServiceImpl implements WelcomeService {

    @Override
    public String welcome(String yourName) {
        return String.format("hi %s,welcome to guice world!", yourName);
    }
}
