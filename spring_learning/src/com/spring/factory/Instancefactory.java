package com.spring.factory;

import java.util.HashMap;
import java.util.Map;

public class Instancefactory {

private Map<String,Car> cars=null;
public  Instancefactory(){
    cars=new HashMap<String,Car>();
    cars.put("audi",new Car("audi","guangdong",30000,400));
    cars.put("vovo",new Car("vovo","guangdong",30000,400));
}
public Car getCar(String name){


    return cars.get(name);

}


}
