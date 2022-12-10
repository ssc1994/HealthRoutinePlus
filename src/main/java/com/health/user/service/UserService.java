package com.health.user.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.health.user.model.UserVO;

public interface UserService {

	public int join(HttpServletRequest request, HttpServletResponse response);
	
	public UserVO login(HttpServletRequest request, HttpServletResponse response);
}
