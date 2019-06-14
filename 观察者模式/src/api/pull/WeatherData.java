package api.pull;

import java.util.Observable;

/**
 * 推的方式
 * @Author: Administrator
 * @Date: 2019/6/7 20:42
 */

public class WeatherData extends Observable {

    private String temp;
    private String weather;
    private double pressure;

    private String result;

    public void update() {
        setChanged();
        notifyObservers(result);
    }

    /**
     * 按照道理来说这个方法应该由气象站去调用
     */
    public void setWeathers(String temp,String weather,double pressure){
        this.temp = temp;
        this.weather = weather;
        this.pressure = pressure;
        // 构造发送给观察者字符串
        result += (temp+"， "+weather+"， "+pressure);
        update();
    }

}
