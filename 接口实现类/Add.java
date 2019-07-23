package FactoryMode.接口实现类;

import FactoryMode.MyInterface.Operation;

//定义具体的操作类:加法计算
public class Add implements Operation {
    @Override
    public double getResult(double numberA, double numberB) throws Exception {
        return numberA + numberB;
    }
}
