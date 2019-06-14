package cn.zcy.com;

/**
 * 来一杯Espresso咖啡加两份Mocha
 * @Author: Administrator
 * @Date: 2019/6/8 23:49
 */

public class Test {

    public static void main(String[] args){
        Beverage coffee = new Espresso();
        Beverage beverageMocha1 = new Mocha(coffee);
        Beverage beverageMocha2 = new Mocha(beverageMocha1);
        System.out.println(beverageMocha2.getDescription()+","+beverageMocha2.cost());
    }

}
