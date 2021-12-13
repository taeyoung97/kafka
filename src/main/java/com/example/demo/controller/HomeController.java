package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.KafkaProducerService;



//사용자의 요청을 처리 한 후 지정된 뷰에 모델 객체를 넘겨주는 역할
@Controller 
public class HomeController { 
	
	@Autowired KafkaProducerService con;
	
	@RequestMapping(value = "/home", method=RequestMethod.GET) 
	public ModelAndView goHome(HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView(); 
		String result;

		
		mav.setViewName("home");
		return mav;		
	}
}
