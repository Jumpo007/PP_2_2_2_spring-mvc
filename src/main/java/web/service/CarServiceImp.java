package web.service;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService {

    @Override
    public List<Car> getCars(Integer count){
        List<Car> carList = new ArrayList<>();
        { carList.add(new Car("bmw","320","red"));
            carList.add(new Car("taz","1","black"));
            carList.add(new Car("volvo","95","blue"));
            carList.add(new Car("audi","4","yellow"));
            carList.add(new Car("mazda","6","purple"));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
