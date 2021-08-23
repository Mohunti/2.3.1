package web.Dao;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {
    private List<User> users;

    {
        users = new ArrayList<>();
        users.add(new User("Anton","Shirshov", "24", "bmw"));
        users.add(new User("Petr","Petrov", "27", "mersedes"));
        users.add(new User("Ivan","Ivanov", "38", "kia"));
        users.add(new User("Stas","Stasov", "56", "mazda"));
        users.add(new User("Oleg","Olegov", "31", "ford"));

    }

    public List<User> getCars() {
        return users;
    }

    public List<User> getCars(Integer count) {
        return users.subList(0, count);
    }
}
