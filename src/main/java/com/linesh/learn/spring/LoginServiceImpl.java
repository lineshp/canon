package com.linesh.learn.spring;

import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

	public boolean isValidUser(String name) {
		return "linesh".equals(name);
	}

}
