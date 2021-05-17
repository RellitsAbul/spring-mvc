package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDao;
import web.model.Car;

import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    @Autowired
    CarDao carDao;

    @Override
    public List<Car> getCarList(Integer count) {
        if (count == null || count >= 5)
            count = 5;
        return carDao.getCarList(count);
    }
}
