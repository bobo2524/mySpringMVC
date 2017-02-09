package com.user.action;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.user.bean.UserInfo;

/**
 * @author BOHUANG
 *
 */
@Controller
public class UserAction {
	@RequestMapping(value = "/toLogin.do")
	public String userLogin(ModelMap map){    
    System.out.print("Values:"+map.values());
        return "/Login";
    }
	
	@RequestMapping(value="addUser",method = RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute UserInfo user,HttpServletRequest  request,HttpServletResponse response)
	{
		
		return null;
	}
	
}

