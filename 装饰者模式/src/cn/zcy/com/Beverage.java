package cn.zcy.com;

/**
 * 菜单
 * @Author: Administrator
 * @Date: 2019/6/8 23:28
 */

public abstract class Beverage {

    /**
     * 当前产品的描述
     */
    public String description;

    public String getDescription() {
        return description;
    }

    /**
     * 计算金额
     * @return
     */
    public abstract double cost();


}
