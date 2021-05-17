package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao{
    List<Car> carList;
    {
        carList = new ArrayList<>();
        carList.add(new Car(1, "Alpine", 404));
        carList.add(new Car(2, "Bristol", 666));
        carList.add(new Car(3, "Vector", 357));
        carList.add(new Car(4, "WAZ", 2106));
        carList.add(new Car(5, "Dodge", 39));

    }


    @Override
    public List<Car> getCarList(int count) {
        return carList.subList(0, count);
    }
}
