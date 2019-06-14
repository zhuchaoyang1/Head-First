package my;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Administrator
 * @Date: 2019/6/7 20:22
 */

public class WeatherData implements Subject {

    private String temp;
    private String weather;
    private double pressure;

    private List<Observe> observeList;
    private Observe observe;

    public WeatherData(){
        if(observeList == null){
            observeList = new ArrayList<>();
        }
    }

    @Override
    public void addObserver(Observe observe) {
        observeList.add(observe);
    }

    @Override
    public void deleteObserver(Observe observe) {
        observeList.remove(observe);
    }

    @Override
    public void update() {
        for(Observe observe: observeList){
            observe.update(this.temp,this.weather,this.pressure);
        }
    }

    /**
     * 按照道理来说这个方法应该由气象站去调用
     */
    public void setWeathers(String temp,String weather,double pressure){
        this.temp = temp;
        this.weather = weather;
        this.pressure = pressure;
        update();
    }


}
