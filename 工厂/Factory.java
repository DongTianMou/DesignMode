package FactoryMode.工厂;

import FactoryMode.MyInterface.Operation;
import FactoryMode.接口实现类.Add;
import FactoryMode.接口实现类.Sub;

public class Factory {
    // 简单工厂，根据字符串创建相应的对象
    public static Operation createOperation(String name) {
        Operation operationObj = null;
        switch (name) {
            case "+":
                operationObj = new Add();
                break;
            case "-":
                operationObj = new Sub();
                break;
        }
        return operationObj;
    }
}
