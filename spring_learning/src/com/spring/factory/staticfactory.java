package com.spring.factory;

import java.util.HashMap;
import java.util.Map;

public class staticfactory {
private  static Map<String,Car> cars=new HashMap<String,Car>();
static {
    cars.put("audi",new Car("audi","shanghai",30000,300));
    cars.put("fold",new Car("fold","beijing",29000,300));


}
    public static Car getCar(String name){


return cars.get(name);
    }
}
