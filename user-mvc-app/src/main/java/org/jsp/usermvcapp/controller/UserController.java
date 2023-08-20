package org.jsp.usermvcapp.controller;

import org.jsp.usermvcapp.dao.UserDao;
import org.jsp.usermvcapp.dto.User;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class UserController {
	UserDao dao = new UserDao();

	@RequestMapping(value = "/register")
	public ModelAndView saveUser(@ModelAttribute User u, ModelAndView view) {
		dao.saveUser(u);
		view.addObject("msg", "User saved with id" + u.getId());
		view.setViewName("print.jsp");
		return view;
	}
}
