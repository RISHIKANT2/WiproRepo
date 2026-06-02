package com.wipro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String loginPage() {
		return "Login";
	}
	@RequestMapping("/signUp")
	public String SignUpPage() {
		return "SignUp";
	}
	@RequestMapping("/Profile")
	public ModelAndView welcomePage() {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("Profile");
		Map<String,String> details=new HashMap<>();
		details.put("name","Rishikant");
		details.put("image","https://media.gettyimages.com/id/1752533660/video/happy-worker-and-face-of-business-asian-man-in-office-with-pride-confidence-and-ambition-in.jpg?s=640x640&k=20&c=FPPyepfVwPRmGudzLY-RkfVPiT1lPE_wBZ2WQZVGUOM=");
		details.put("designation","Manager");
		mv.addObject("details", details);
		return mv;
	}
	

}
