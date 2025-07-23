package org.jsp.sms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
	@Autowired
	StudentRepository sr;
	
	@ResponseBody
	@RequestMapping("/savestu")
	public Student savestudent(@RequestBody Student s) {
		return sr.save(s);
	}
	
	@ResponseBody
	@RequestMapping("/findallstu")
	public List<Student> findallstudent(){
		List<Student> all = sr.findAll();
		return sr.findAll();
	}
	
	@ResponseBody
	@RequestMapping("/deletestu")
	public String deletestudent(@RequestBody int id) {
		sr.deleteById(id);
		return "Student deleted successflly..";
	}
	
	@ResponseBody
	@RequestMapping("/findbyid")
	public Student findById(@RequestParam int id) {
		Student s = sr.findById(id).get();
		return s;
	}
	
	
	
	
	
	
	
	
	
	
	
}
