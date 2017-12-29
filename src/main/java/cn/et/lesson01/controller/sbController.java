package cn.et.lesson01.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.et.lesson01.dao.EmpRepository;
import cn.et.lesson01.service.EmpService;
import cn.et.lesson01.service.impl.EmpServiceImpl;
@SpringBootApplication
@RestController
public class sbController {
	@Autowired
	EmpService es;
	//装配数据库
	@RequestMapping("/query/{empId}")
	public Map getEmp(@PathVariable Integer empId){		
		return es.getEmp(empId);
	}
	//装配Hibernate
	@RequestMapping("/saveEmp")
	public String saveEmp(){
		return es.saveEmp();
	}
	
	@RequestMapping("/test")
	public Map hello(){
		Map map=new HashMap();
		map.put("id", 1);
		map.put("name", "ls");
		return map;
	}
	
	public static void main(String[] args) {
		  SpringApplication.run(sbController.class, args);
	}
}
