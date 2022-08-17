package web.Model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private String series;
    private String color;

    public Car(String model, String series, String color) {
        this.model = model;
        this.series = series;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
//    public List<Car> carList = new ArrayList<>();
//    { carList.add(new Car("bmw","320","red"));
//        carList.add(new Car("taz","1","black"));
//        carList.add(new Car("volvo","95","blue"));
//        carList.add(new Car("audi","4","yellow"));
//        carList.add(new Car("mazda","6","purple"));
//    }

}
