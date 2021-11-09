package com.cars.demo.services;

import com.cars.demo.entities.Car;
import com.cars.demo.payloads.carCreate.CarCreate;
import com.cars.demo.repo.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CarServices {
    @Autowired
    private CarRepo repo;

    public void create(CarCreate car){
        Car dbCar = new Car(car.getName(), car.getBrand());
        this.repo.save(dbCar);
    }

    public List<Car> all() {
        return this.repo.findAll();
    }

    public Optional<Car> find(Long id){
        return this.repo.findById(id);
    }
//    public void update here


    public void update(Car car, Long id){
        this.repo.save(car);
    }

    public void delete(Long id) {this.repo.deleteById(id);}
}
