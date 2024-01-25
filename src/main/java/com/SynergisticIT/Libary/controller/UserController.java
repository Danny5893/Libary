package com.SynergisticIT.Libary.controller;

import com.SynergisticIT.Libary.model.User;
import com.SynergisticIT.Libary.service.UserService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService){
        super();
        this.userService = userService;
    }

    @GetMapping("/users")
    public String listUser(Model model){
        model.addAttribute("user", userService.getAllUsers());
        return "user";
    }

    @GetMapping("/users/new")
    public String createUserForm(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "create_user";
    }

    @PostMapping("/user")
    public String saveUser(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:/user";
    }

    @GetMapping("/users/edit/{id}")
    public  String editUserForm(@PathVariable Integer id, Model model){
        model.addAttribute("user", userService.getUserByID(id));
        return "edit_user";
    }

    @PostMapping("/users/{id}")
    public String updateUser(@PathVariable Integer id, @ModelAttribute("user") User user, Model model){
        User existingUser = userService.getUserByID(id);
        existingUser.setUserId(id);
        existingUser.setUserName(user.getUserName());
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        existingUser.setBorrowedBooks(user.getBorrowedBooks());
        userService.updateUser(existingUser);
        return "redirect:/users";
    }

    @GetMapping("users/{id}")
    public String deleteUser(@PathVariable Integer id){
        userService.deleteUserByID(id);
        return "redirect:/users";
    }

}
