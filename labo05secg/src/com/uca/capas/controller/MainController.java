package com.uca.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.dao.StudentDAO;
import com.uca.capas.domain.Student;

@Controller
public class MainController {
	
	@Autowired
	private StudentDAO studentDao;
	
	/*
	@RequestMapping("/")
	public ModelAndView initMain(){
		ModelAndView mav = new ModelAndView();
		
		List<Student> students = null;
		try {
		 students = studentDao.findAll();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		mav.addObject("students",students);
		mav.setViewName("main");
		return mav;
	}*/
	
	@RequestMapping("/")
	public ModelAndView initMain(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("message","Inserte id");
		mav.setViewName("form");
		return mav;
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public ModelAndView user(@RequestParam(value = "id") String id){
		ModelAndView mav = new ModelAndView();
		Student student = new Student();
		
		try {
			student = studentDao.findOne(Integer.parseInt(id));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		mav.addObject("students",student);
		mav.setViewName("main");
		return mav;
	}
}