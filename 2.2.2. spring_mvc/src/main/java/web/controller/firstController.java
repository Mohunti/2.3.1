package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.Dao.UserDAO;
import web.model.User;

@Controller
@RequestMapping("/users")
public class firstController {

    private final UserDAO userDAO;

    @Autowired
    public firstController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @GetMapping()
    public String index(Model model){
        model.addAttribute("users", userDAO.index());
        return "index";
    }

    @GetMapping("/{id}")
    public String showById(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", userDAO.showById(id));
        return "showById";
    }

    @GetMapping("/new")
    public String newPersone(Model model) {
        model.addAttribute("user", new User());
        return "new";
    }

    @PostMapping()
    public String create(@ModelAttribute ("user") User user) {
        userDAO.save(user);
        return "redirect:/users";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id) {
        model.addAttribute("user", userDAO.showById(id));
        return "edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("user") User user, @PathVariable("id") int id) {
        userDAO.update(id, user);
        return "redirect:/users";
    }
}











