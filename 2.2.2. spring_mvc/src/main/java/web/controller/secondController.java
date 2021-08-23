package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Dao.CarDao;
import web.model.User;
import java.util.List;


@Controller
@RequestMapping("/")
public class secondController {

    @Autowired
    private CarDao CarDao;

    @GetMapping("/users")
    public String show(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<User> users;
        if (count == null || count >= 5 ) {
            users = CarDao.getCars();
        } else {
            users = CarDao.getCars(count);
        }
        model.addAttribute("users", users);
        return "users";
    }
}
