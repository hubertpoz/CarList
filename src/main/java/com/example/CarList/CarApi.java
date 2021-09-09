package com.example.Carlist;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CarApi {

    private List<Car> carlist;

    public CarApi() {
        this.car = new ArrayList<>();
    }

    @GetMapping("/{mark}")
    public Car getCars(@PathVariable int mark) {
        return carlist.stream()
                .filter(car -> car.getMark() == mark).findFirst().get();
    }

    @GetMapping("/")
    public List<Car> getCars) {
        return carList;
    }

    @PostMapping("/add")
    public boolean addCar(@RequestBody Car car) {
        return CarList.add(car);
    }

}
