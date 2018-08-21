package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.example.demo.bean.MyRequestBean;
import com.example.demo.service.MyProductService;

//@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)//跨域
@RestController
@RequestMapping("/test")
public class MyTestController {
		@Autowired
		MyProductService myProductService;
	    @RequestMapping(value="/product",method=RequestMethod.GET)
	    public String Hello(@RequestParam(name = "name")String name){

	        return "Hello World GET:"+name;
	    }
	    
	    @RequestMapping(value="/product",method=RequestMethod.POST)
	    public String Hello_Post(@RequestBody MyRequestBean req){
	    	
	        return "Hello World POST"+JSON.toJSONString(req);
	    }
	    
	    @RequestMapping(value="/getAllProduct",method=RequestMethod.POST)
	    public String getAllProduct(@RequestBody MyRequestBean req){
	    	System.out.println("getLists:"+JSON.toJSONString(myProductService.getLists()));
	    	System.out.println("getListById:"+JSON.toJSONString(myProductService.getListById("%")));
	    	/*System.out.println(JSON.toJSONString(myProductService.getLists()));
	    	System.out.println(JSON.toJSONString(myProductService.getLists()));*/
	    	
	        return "Hello World POST"+JSON.toJSONString(myProductService.getLists());
	    }
}
