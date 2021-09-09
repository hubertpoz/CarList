package com.example.CarList;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CarApi {

    private List<Car> carList;

    public CarApi() {
        this.carList = new ArrayList<>();
    }

    @GetMapping("/{mark}")
    public Car getMark(@PathVariable int mark) {
        return carList.stream()
                .filter(Car -> Car.getMark() == mark).findFirst().get();
    }

    @GetMapping("/")
    public List<Car> getCars() {
        return carList;
    }

    @PostMapping("/add")
    public boolean addCar(@RequestBody Car car) {
        return carList.add(car);
    }

}


    

