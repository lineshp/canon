package com.linesh.learn.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Java Developer Zone on 19-07-2017.
 */
@Controller
public class IndexController {
	
	@Autowired
	private ApplicationContext context;

    @RequestMapping("/canon/*")
    public ModelAndView index() {
    	
    	if(context.getBean(UserExtDtls.class).postCode == null) {
    		return new ModelAndView("index");
    	}
    	else {
    		
    		ModelMap m= new ModelMap();
    		m.put("loginDetails", new LoginDetail());
    		return new ModelAndView("login", m);

    	}
    		
        
    }
}