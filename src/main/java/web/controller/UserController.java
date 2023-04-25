package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping(value = "/addUser")
    public String addUser(ModelMap model) {
        //User user = new User();
        model.addAttribute("addUser", new User());
        return "addUser";
    }

    @PostMapping()
    public String create(@ModelAttribute("addUser") User user){
    userService.add(user);
    return "redirect:/users";
    }

//    @GetMapping(value = "/users/userUpdate")
//    public String userUpdate(ModelMap model) {
//        model.addAttribute("userUpdate", userService.updateUser());
//        return "userUpdate";
//    }
//    @GetMapping(value = "/user/{id}")
//    public String deleteUser(@PathVariable long id) {
//        userService.deleteUserById(id);
//        return "redirect:/users";
//    }
}
