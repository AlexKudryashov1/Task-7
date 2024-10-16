package ru.bahlish.Mavenprofect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.bahlish.Mavenprofect.MavenprofectApplication;
import ru.bahlish.Mavenprofect.model.User;
import ru.bahlish.Mavenprofect.services.UserService;

@RestController
public class controller {
 private final UserService userService;

 @Autowired
 public controller(UserService userService) {
  this.userService = userService;
 }

 @GetMapping()
 public String run(){
  userService.getUsers();

  User user = new User(3L, "James", "Brown", (byte) 30);
  String first = userService.createUser(user);

  user.setName("Thomas");
  user.setLastName("Shelby");

  return first + userService.updateUser(user) + userService.deleteUser(user.getId().toString());

 }
}

