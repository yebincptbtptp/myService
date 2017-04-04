package com.yeb.www.controller.view;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yeb.www.po.User;
import com.yeb.www.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value="/findUser.do")
	public String findUser(String name, ModelMap model) {
		User user = userService.findUserByName("赵东来");
		model.addAttribute("User", user);
		User user1 = userService.findUserByName("高育良");
		
		List<User> users = new ArrayList<User>();
		users.add(user);
		users.add(user1);
		
		model.addAttribute("users", users);
		
		Map<String, User> userMap = new HashMap<String, User>();
		userMap.put(user.getName(), user);
		userMap.put(user1.getName(), user1);
		model.addAttribute("userMap", userMap);
		
		return "showUser";
	}
	
	@RequestMapping(value="/doTest.do")
	public String doTest(ModelMap model) {
		int intVar = 10000;
		model.addAttribute("intVar", intVar);
		long longVar = 1000;
		model.addAttribute("longVar", longVar);
		String strVar = "FreeMarker";
		model.addAttribute("strVar", strVar);
		double doubleVar = 1.234;
		model.addAttribute("doubleVar", doubleVar);
		boolean booleanVar = true;
		model.addAttribute("booleanVar", booleanVar);
		Date date = new Date();
		model.addAttribute("dateVar", date);
		model.addAttribute("nullVar", null);
		return "doTest";
	}
	
	@RequestMapping(value="/main.do")
	public String index() {
		
		return "main";
	}
}
