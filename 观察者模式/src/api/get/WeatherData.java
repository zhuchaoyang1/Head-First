package api.get;

import java.util.Observable;

/**
 * 观察者拉的方式
 * @Author: Administrator
 * @Date: 2019/6/7 20:42
 */

public class WeatherData extends Observable {

    private String temp;
    private String weather;
    private double pressure;

    public void update() {
        setChanged();
        notifyObservers();
    }

    /**
     * 按照道理来说这个方法应该由气象站去调用
     */
    public void setWeathers(String temp,String weather,double pressure){
        this.temp = temp;
        this.weather = weather;
        this.pressure = pressure;
        // 构造发送给观察者字符串
        update();
    }

    public String getTemp() {
        return temp;
    }

    public String getWeather() {
        return weather;
    }

    public double getPressure() {
        return pressure;
    }

}
