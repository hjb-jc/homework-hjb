package com.personal.CarMall.web.dao;

import com.personal.CarMall.web.entity.Car;

import java.util.List;

public interface CarMallDAO {
    List<Car> getCarInfoAll();
    Car getCarByid(int id);
    List<Car> getCarByName(String name);
    boolean updataCar(Car car);
    boolean deleteCar(int id);
    Car addCar(Car car);
}
