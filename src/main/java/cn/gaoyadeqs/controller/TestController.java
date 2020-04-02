package cn.gaoyadeqs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.gaoyadeqs.domain.Book;
import cn.gaoyadeqs.mapper.BookMapper;

@Controller
public class TestController {
	
	@Autowired
	private BookMapper bookMapper;
	
	@RequestMapping("book/{id}")
	@ResponseBody
	public Book book(@ PathVariable("id")long id) {
		System.out.println(id);
		return bookMapper.queryById(id);
	}

}
