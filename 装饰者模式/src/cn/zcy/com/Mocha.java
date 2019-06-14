package cn.zcy.com;

/**
 * 装饰者之一  摩卡调料
 * @Author: Administrator
 * @Date: 2019/6/8 23:45
 */

public class Mocha extends CondimentDecorator{

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+"，加Mocha调料";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.4;
    }
}
