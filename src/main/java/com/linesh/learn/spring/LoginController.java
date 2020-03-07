package com.linesh.learn.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@Autowired
	private ApplicationContext context;

	@RequestMapping(value="/login", method = RequestMethod.GET)
	public ModelAndView showLoginPage(ModelMap model){
		System.out.println("***************login************");
		model.addAttribute("loginDetails", new LoginDetail()); 
		UserExtDtls c = context.getBean(UserExtDtls.class);
		c.setPostCode("122");
		return new ModelAndView("login", model);
	}

	@RequestMapping(value="/processLogin", method = RequestMethod.POST)
	public ModelAndView processLogin(@ModelAttribute("loginDetails") LoginDetail loginDetails,  BindingResult result, ModelMap m){
		System.out.println(loginDetails);
		if(loginService.isValidUser(loginDetails.getName())) {
			UserExtDtls c = context.getBean(UserExtDtls.class);
			System.out.println(c.postCode);
			return new  ModelAndView("success", m);
		}
		else {
			m.addAttribute("loginDetails", new LoginDetail()); 
			return new  ModelAndView("login", m);
		}


	}
}
