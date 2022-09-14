package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Kia", "Rio", 1_300_000));
        cars.add(new Car("Geely", "Coolray", 1_600_000));
        cars.add(new Car("Audi", "A4", 4_800_000));
        cars.add(new Car("Haval", "Jolion", 1_300_000));
        cars.add(new Car("Nissan", "Qashqai", 1_900_000));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
