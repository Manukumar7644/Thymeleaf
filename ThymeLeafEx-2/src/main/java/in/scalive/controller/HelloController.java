package in.scalive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class HelloController {
   @RequestMapping(method = RequestMethod.GET, value="/hello")
	public String sayHello(Model model) {
	   model.addAttribute("message","Hello User, Welcome To Thymeleaf");
	   return "greetings";
   }
   @RequestMapping(method = RequestMethod.GET, value="/about")
	public String about() {
	   return "redirect:about.html";
  }
}
