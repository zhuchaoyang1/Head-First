package api.get;


import java.util.Observable;
import java.util.Observer;

/**
 * @Author: Administrator
 * @Date: 2019/6/7 20:29
 */

public class ContitionOne implements Observer {

    /** API 提供的主题对象  -->  抽象类 */
    private Observable observable;

    public ContitionOne(Observable observable){
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        // 拉取O中数据
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            System.out.println(weatherData.getPressure()+"， "+weatherData.getTemp()+"， "+weatherData.getWeather());
        }
    }
}
