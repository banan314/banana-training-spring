package trainer.banana.spring.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import trainer.banana.spring.model.User;
import trainer.banana.spring.service.UserService;

import java.util.NoSuchElementException;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {

  @Inject
  UserService userService;

  //api
  // GET host/user/{id}
  //registration: POST host/user/{id}, 
  // PUT host/user/{id}

  @ExceptionHandler(NoSuchElementException.class)
  @ResponseBody
  HttpStatus handleControllerException(HttpServletRequest request, Throwable ex) {
    return HttpStatus.NOT_FOUND;
  }

  @GetMapping(path="user/{id}")
  public User getUser(@PathVariable int id) {
    return userService.getUser(id).get();
  }

  //returns id
  @PostMapping(path="user/add")
  public int addUser(@PathVariable int id, @RequestBody User user) {
    return 0;
  }
}