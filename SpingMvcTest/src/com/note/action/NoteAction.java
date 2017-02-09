package com.note.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.note.bean.NoteBook;

@Controller
public class NoteAction {
	@RequestMapping(value = "/getNoteList.do", method= RequestMethod.POST)
	@ResponseBody
	public List<NoteBook> getNoteList(HttpServletRequest request)
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
