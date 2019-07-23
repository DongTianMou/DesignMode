package FactoryMode;

import FactoryMode.MyInterface.Operation;
import FactoryMode.工厂.Factory;

public class Client {
    /*
        我们无需提供具体的子类类名，只需要提供一个字符串即可得到相应的实例对象。
        这样的话，当子类的类名更换或者增加子类时我们都无需修改客户端代码，
        只需要在简单工厂类上增加一个分支判断代码即可。
     */
    public static void main(String[] args) throws Exception {

        Operation add = Factory.createOperation("+");
        Operation sub = Factory.createOperation("-");

        System.out.println(add.getResult(1, 1));
        System.out.println(sub.getResult(1, 1));
    }
}
