package trainer.banana.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HelloController
{
  // localhost:8090/metoda
  @RequestMapping(path="/metoda", method=RequestMethod.GET)
  // @ResponseBody
  public String index() {
    return "Hello Spring Boot ";
  }
  
  


}
