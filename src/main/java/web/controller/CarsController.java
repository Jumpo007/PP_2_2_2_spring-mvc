
package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

    @Controller
    public class CarsController {
        private final CarService cars;

        @Autowired
        public CarsController(CarService carService) {
            this.cars = carService;
        }

        @GetMapping(value = "/cars")
        public String limitedList(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
            System.out.println("The client passed the value " + count);
            model.addAttribute("list", cars.getCars(count));
            return "cars";
        }

    }
