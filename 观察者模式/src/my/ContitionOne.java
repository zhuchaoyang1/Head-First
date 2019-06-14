package my;

/**
 * @Author: Administrator
 * @Date: 2019/6/7 20:29
 */

public class ContitionOne implements Observe , ShowInter {

    private Subject subject;

    public ContitionOne(Subject subject){
        subject.addObserver(this);
    }

    @Override
    public void update(String temp, String weather, double pressure) {
        display(temp,weather,pressure);
    }

    @Override
    public void display(String temp, String weather, double pressure) {
        System.out.println(temp+"," +weather+", "+pressure);
    }
}
