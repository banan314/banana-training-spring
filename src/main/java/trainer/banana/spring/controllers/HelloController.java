package trainer.banana.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HelloController
{
  // localhost:8090/metoda
  @RequestMapping(path="/metoda", method=RequestMethod.GET)
  // @ResponseBody
  public String index() {
    return "index ";
  }
  
  @RequestMapping("/accounts")
  public ModelAndView account(){
    ModelAndView modelAndView= new ModelAndView();
    modelAndView.setViewName("accounts");
    return modelAndView;
  }
  @RequestMapping("/about_us")
  public ModelAndView about(){
    ModelAndView modelAndView= new ModelAndView();
    modelAndView.setViewName("aboutus");
    return modelAndView;
  }
  @RequestMapping("/auctions")
  public ModelAndView auction(){
    ModelAndView modelAndView= new ModelAndView();
    modelAndView.setViewName("auctions");
    return modelAndView;
  }
  @RequestMapping("/index")
  public ModelAndView indexes(){
    ModelAndView modelAndView= new ModelAndView();
    modelAndView.setViewName("index");
    return modelAndView;
  }
}
