package com.SBwithHB.com.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SBwithHB.com.demo.Model.Student;
import com.SBwithHB.com.demo.Service.StudentService;


@RestController
public class MyController {
	
	@Autowired
	StudentService se ;
	
	@PostMapping("/student")
	public boolean insertdata(@RequestBody Student stduent ) {
		boolean bs =se.insertdata(stduent);
		return bs;
	}
	
	@GetMapping("/all")
	public  List<Student> getalldata() {
		List<Student> list = se.getalldata();
		return list;
	}
	
	
	@RequestMapping("/soma")
   public String home() {
		return "SOma HOME";
	}
	
	@GetMapping("data/{id}")
	public Student getdatabyid(@PathVariable int id) {
		Student ss = se.getdatabyid(id);
		return ss;
		
	}
	
	@DeleteMapping("/delet/{id}")
	public boolean deletbyid(@PathVariable int id ) {
		boolean bb =se.deletbyid(id);
		return bb;
	}
	
	@PutMapping("/update/{id}")
	public boolean updatebyid(@RequestBody Student student,@PathVariable int id) {
		boolean bb =se.updatebyid(id,student);
		return bb;
	}

}
