package com.cars.demo.controllers;

import com.cars.demo.entities.Car;
import com.cars.demo.payloads.carCreate.CarCreate;
import com.cars.demo.services.CarServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value ="/cars")
public class CarController {
    @Autowired
    private CarServices carServices;


    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void save(@Valid @RequestBody CarCreate car){
        this.carServices.create(car);
    }

    @GetMapping
    public List<Car> all() {
        return this.carServices.all();
    }

    @GetMapping(value = "/{id}")
    public Car find(@PathVariable Long id){
        Optional<Car> car = this.carServices.find(id);
        if(car.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Car not found");
        }
        return car.get();
    }

    @PutMapping("/cars/{id}")
    public void updateCar(@RequestBody Car car, @PathVariable Long id){
//        Something Like this for update I am unsure
//        car.setBrand();
//        car.setModel();
//        carServices.update(car, id);
    }

    @DeleteMapping(value="/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        this.carServices.find(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Car not found"));
        this.carServices.delete(id);
    }
}
