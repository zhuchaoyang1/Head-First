package api.get;

/**
 * 这是推送方式
 * @Author: Administrator
 * @Date: 2019/6/7 20:32
 */

public class Test {

    public static void main(String[] args){
        // 构建Subject对象
        WeatherData weatherData = new WeatherData();

        // 构建两个观察者对象
        ContitionOne contitionOne = new ContitionOne(weatherData);
        ContitionOne contitionTwo = new ContitionOne(weatherData);

        weatherData.setWeathers("22°C","天气晴朗",2.0);
    }
}
