package cn.zcy.com;

/**
 * Espresso咖啡
 * @Author: Administrator
 * @Date: 2019/6/8 23:33
 */

public class Espresso extends Beverage{

    public Espresso(){
        description = "Espersso咖啡";
    }

    @Override
    public double cost() {
        return .6;
    }
}
