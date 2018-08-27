package com.personal.CarMall.web.dao;

import com.personal.CarMall.web.entity.Car;

import java.util.*;

public class CarImplementation implements CarMallDAO{

    private static List<Car> carDB = new ArrayList<Car>();

    static {
        Car c1=new Car(1,"传奇","A型","黑色",477.8);
        Car c2=new Car(2,"兰博基尼","B型","红色",373.4);
        Car c3=new Car(3,"劳斯莱斯","C型","黑色",474.2);
        Car c4=new Car(4,"保时捷","D型","银色",344.3);
        Car c5=new Car(5,"大奔","E型","褐色",393.7);

        carDB.add(c1);
        carDB.add(c2);
        carDB.add(c3);
        carDB.add(c4);
        carDB.add(c5);
    }

    @Override
    public List<Car> getCarInfoAll() {
        return carDB;
    }
    @Override
    public Car getCarByid(int id) {
        for (Car car : carDB) {
            if(car.getId()==id){
                return car;
            }
        }
        return null;
    }

    @Override
    public List<Car> getCarByName(String name) {
        List<Car> cars=new ArrayList<Car>();
        for (Car car : carDB) {
            if(car.getName().toLowerCase().contains(name.toLowerCase())){
                cars.add(car);
            }
        }
        return cars;
    }

    @Override
    public boolean updataCar(Car car) {
        for (Car car1 : carDB) {
            if(car1.getId()==car.getId() ){
                car1.setName(car.getName());
                car1.setModel(car.getModel());
                car1.setColor(car.getColor());
                car1.setPrice(car.getPrice());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteCar(int id) {
        for (Car car : carDB) {
            if(car.getId()==id){
                return carDB.remove(car);
            }
        }
        return false;
    }

    @Override
    public Car addCar(Car car) {
        if(carDB.add(car)){
            return car;
        }
        return null;
    }
}
