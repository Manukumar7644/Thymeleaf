package in.scalive.controller;

import java.util.List;

import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.scalive.model.Student;



@Controller
public class StudentController {
   @RequestMapping(method=RequestMethod.GET,value="/showcourses")	
   public String showCourses(Model model) {
	   String[] courses= {"Java","Python","Spring Boot"};
	   model.addAttribute("courses",courses);
	   return "show-courses";
   }
   @RequestMapping(method=RequestMethod.GET,value="/showstudents")	
   public String showStudents(Model model) {
	   List <Student>studList=List.of(new Student(101,"Ravi","Java"),new Student(102,"Ajay","Python"),new Student(103,"Deepak","Spring Boot"));
	   model.addAttribute("students",studList);
	   return "show-students";
   }
}
