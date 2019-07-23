package FactoryMode.接口实现类;

import FactoryMode.MyInterface.Operation;

//定义具体的操作类:减法计算
public class Sub implements Operation {
    @Override
    public double getResult(double numberA, double numberB) throws Exception {
        return numberA - numberB;
    }
}
