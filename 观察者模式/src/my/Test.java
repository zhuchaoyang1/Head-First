package my;

/**
 * @Author: Administrator
 * @Date: 2019/6/7 20:32
 */

public class Test {

    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        Observe conditionOne = new ContitionOne(weatherData);

        weatherData.setWeathers("22°C","天气晴朗",2.0);
    }
}
