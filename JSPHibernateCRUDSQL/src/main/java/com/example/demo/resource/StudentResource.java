package com.example.demo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Controller
public class StudentResource 
{

	@Autowired
	StudentRepository s;
	
	@RequestMapping("home")
	public String home() {
		return "main.jsp";
	}
	
	@RequestMapping("add")
	public String add() {
		return "adding.jsp";
	}
	
	@RequestMapping("addStudent")
	public String addStudent(Student s1) {
		s.save(s1);
		return "add.jsp";
			
	}
	
	@RequestMapping("edit")
	public String edit() {
		return "edit.jsp";
	}
	
	@RequestMapping("update")
	public String updateStudent(Student s1) {
		int id = s1.getId();
		if(s.findById(id).isPresent()) {
		Student newStudent = s.findById(s1.getId()).orElse(null);
		newStudent.setName(s1.getName());
		newStudent.setPosition(s1.getPosition());
		s.save(newStudent);
		return "add.jsp";
		}
		else
			return "error.jsp";
	}
	
	@RequestMapping("search")
	public String search() {
		return "search.jsp";
	}
	
	@RequestMapping("searching")
	public ModelAndView search(int id) {
		ModelAndView model = new ModelAndView("show.jsp");
		ModelAndView m = new ModelAndView("error.jsp");
		if(s.findById(id).isPresent()) {
			model.addObject("Student", s.findById(id));
			return model;
		}
		else
			return m;
	}
	
	@RequestMapping("deleteRecord")
	public String deleting() {
		return "deleting.jsp";
	}
	
	@RequestMapping("delete")
	public String delete(int id) {
		if(s.findById(id).isPresent()) {
			s.deleteById(id);
			return "delete.jsp";
		}
		else
			return "error.jsp";
	}
}
