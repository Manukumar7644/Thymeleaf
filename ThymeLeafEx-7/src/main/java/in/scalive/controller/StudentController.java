package in.scalive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.scalive.model.Student;



@Controller
public class StudentController {
	@RequestMapping(method = RequestMethod.GET, value="/")
	public String home(Model model) {
	   model.addAttribute("id", 101);
	   return "home";
   }
	@RequestMapping(method = RequestMethod.GET, value="/showStudent")
   public String showStudent(Model model) {
	   Student student=new Student();
	   student.setId(101);
	   student.setName("Manish");
	   student.setCourse("Spring Boot");
	   model.addAttribute("student", student);
	   return "show-student";
	   
   }
	
}
