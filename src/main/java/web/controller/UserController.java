package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.User;
import web.service.UserServiceImpl;

@Controller
public class UserController {

    public final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/users")
    public String printWelcome(ModelMap model) {
        model.addAttribute("usersList", userService.listUsers());
        return "users";
    }
//    @GetMapping(value = "/userUpdate")
//    public String userUpdate(ModelMap model) {
//        model.addAttribute("userUpdate", userService.updateUser());
//        return "userUpdate";
//    }
}
