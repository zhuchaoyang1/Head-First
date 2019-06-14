package my;

/**
 * 主题接口
 * @Author: Administrator
 * @Date: 2019/6/7 20:19
 */

public interface Subject {

    void addObserver(Observe observe);

    void deleteObserver(Observe observe);

    void update();

}
