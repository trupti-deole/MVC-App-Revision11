package com.test.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.binding.Student;
@Controller
public class WelcomeController {
	@RequestMapping(value="/welcome")
	public String welcomePage() {
        return "welcome";
	}
	
	@RequestMapping(value="/**")
	public String FallbackPage() {
        return "error";
	}
	
	@RequestMapping(value="/log")
	public String LoginPage() {
        return "login";
	}
	@RequestMapping(value="/login") //here we get username & password from login.jsp
	public String LoginCheckPage(@RequestParam String uname,@RequestParam String pwd) {
		System.out.println("This is login page:"+uname+" "+pwd);
		if(uname.equalsIgnoreCase("cjc")&&pwd.equals("cjc@123"))
		{
			return "success";
		}
	
		return "index";

	}
	@RequestMapping(value="/reg") //when we click on hyperlink register we get reg method & controller will come here for register purpose
	public String RegisterPage() {
        return "register"; //register.jsp will open
	}
	/*
	@RequestMapping(value="/register") //here we get username & password from login.jsp
	public String StudentRegister(@RequestParam String fname,@RequestParam String lname,@RequestParam String add,@RequestParam String phno,@RequestParam String gender,@RequestParam String language) {
		System.out.println("This is register page:"+fname+" "+lname+" "+add+" "+phno+" "+gender+" "+language);
		
	
		return "index";
		*/
	
	
	@RequestMapping(value="/register") //here we get username & password from login.jsp
	public String StudentRegister(@ModelAttribute Student stud) {
		//System.out.println("This is register page:"+fname+" "+lname+" "+add+" "+phno+" "+gender+" "+language);
		System.out.println(stud.getFname()+" "+stud.getLname()+" "+stud.getAdd()+" "+stud.getPhno()+" "+stud.getGender()+" "+stud.getLanguage());
		
	
		return "index";
	

	}
}
