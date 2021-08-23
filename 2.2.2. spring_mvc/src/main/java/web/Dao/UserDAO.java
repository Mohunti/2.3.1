package web.Dao;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAO {
    private List<User> users;
    private static int USER_COUNT;

    {
        users = new ArrayList<>();
        users.add(new User(++USER_COUNT, "Anton"));
        users.add(new User(++USER_COUNT, "Vlad"));
        users.add(new User(++USER_COUNT, "Oleg"));


    }

    public List<User> index() {
        return users;
    }

    public User showById(int id) {
        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }

    public void save(User user) {
        user.setId(++USER_COUNT);
        users.add(user);
    }

    public void update(int id, User updatedUser) {
        User userToBeUpdated = showById(id);
        userToBeUpdated.setName(updatedUser.getName());
    }
}
