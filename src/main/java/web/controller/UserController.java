package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import web.model.User;
import web.service.UserService;

import java.util.List;

@Controller()
public class UserController {

    @Autowired
    UserService userServiceImpl;

    @GetMapping("/")
    public String showAllUser(ModelMap modelMap) {
        List<User> allUsers = userServiceImpl.getAllUsers();
        modelMap.addAttribute("users", allUsers);
        return "user/users";
    }

    @GetMapping("/new")
    public String newPerson(@ModelAttribute("user") User user){
        return "user/new";
    }

    @PostMapping("/new")
    public String create(@ModelAttribute("user") User user){
        userServiceImpl.save(user);
        return "redirect:/";
    }
}
