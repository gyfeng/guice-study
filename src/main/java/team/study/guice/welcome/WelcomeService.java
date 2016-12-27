package team.study.guice.welcome;

/**
 * Guice第一个实例，输出欢迎字符
 *
 * @author GYFeng by 2016/12/21
 * @version 1.0
 */
public interface WelcomeService {

    /**
     * 输出欢迎字符
     *
     * @param yourName 你的名字
     * @return 欢迎字符串
     */
    String welcome(String yourName);
}
