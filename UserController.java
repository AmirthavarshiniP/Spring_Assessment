package com.example.springasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    public UserRepository userRepository;
    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        User u = new User();
        u.setUserId(u.getUserId());
        u.setUserName(u.getUserName());
        u.setUserEmail(u.getUserEmail());
        u.setGender(u.getGender());
        u.setAge(u.getAge());
        u.setNationality(u.getNationality());
        return u;
    }
    @GetMapping("/viewAll")
    public @ResponseBody Iterable<User> getAllUsers()
    {
        return userRepository.findAll();
    }
    @GetMapping("/viewAll/{id}")
    public Optional<User> getUser(@PathVariable Integer id)
    {
        return userRepository.findById(id);
    }
    @PutMapping("/edit/{id}")
    public String update(@RequestBody User updateUser, @PathVariable Integer id)
    {
        return userRepository.findById(id)
                .map(User -> {
            User.setUserId(updateUser.getUserId());
            User.setUserName(updateUser.getUserName());
            User.setUserEmail(updateUser.getUserEmail());
            User.setGender(updateUser.getGender());
            User.setAge(updateUser.getAge());
            User.setNationality(updateUser.getNationality());
            userRepository.save(User);
                    return " User details have been successfully updated";
                }).orElseGet(()->{
                    return "Invalid user !!!!";
                });

    }
    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id)
    {
        userRepository.deleteById(id);
        return "User deleted !!!!";
    }
}

