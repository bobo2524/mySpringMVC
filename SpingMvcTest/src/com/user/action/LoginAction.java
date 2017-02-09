package com.user.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.note.bean.NoteBook;

/**
 * @author BOHUANG
 *
 */
@Controller
public class LoginAction {
	@RequestMapping(value = "/userLogin.do",method = RequestMethod.POST)
	public ModelAndView showUserInfo(String name,String password)
	{
		System.out.print("name:"+name+",password:"+password);
		if(name.equals("test") && password.equals("123"))
		{
			ModelAndView mv = new ModelAndView("userInfo");
			mv.addObject("name",name);
			mv.addObject("password",password);
			return mv;
		}else{
			ModelAndView mv = new ModelAndView("Login");
			return mv;
		}
	}
	
	@RequestMapping(value = "/getList.do",method = RequestMethod.POST)
	public @ResponseBody List<NoteBook> getList()
	{
		List<NoteBook> noteList = new ArrayList<NoteBook>();
		NoteBook note1 = new NoteBook();
		note1.setId(UUID.randomUUID().toString());
		note1.setTitle("标题1");
		note1.setContent("标题1的内容...");
		SimpleDateFormat df = new SimpleDateFormat();
		note1.setCreatedDate(df.format(new Date()));
		
		NoteBook note2 = new NoteBook();
		note2.setId(UUID.randomUUID().toString());
		note2.setTitle("标题1");
		note2.setContent("标题1的内容...");
		SimpleDateFormat df2 = new SimpleDateFormat();
		note2.setCreatedDate(df2.format(new Date()));
		
		noteList.add(note1);
		noteList.add(note2);
		return noteList;
	}
}
