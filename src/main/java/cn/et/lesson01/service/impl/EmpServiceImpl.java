package cn.et.lesson01.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import cn.et.lesson01.Emp;
import cn.et.lesson01.dao.EmpRepository;
import cn.et.lesson01.service.EmpService;
@Service
public class EmpServiceImpl implements EmpService{
	@Autowired
	JdbcTemplate jdbc;
	@Autowired
	EmpRepository er;
	/**
	 * 添加
	 */
	public String saveEmp(){
		Emp emp=new Emp();
		emp.setDeptid(4);
		emp.setEname("WW");
		emp.setSal(2500.4);
		er.save(emp);
		return "1";
	}
	public Map getEmp(Integer empId){
		
		List<Map<String, Object>> queryForList = jdbc.queryForList("select * from emp where id="+empId);
		return queryForList.get(0);
	
	}
	/**
	 * 查看
	 * @param empId
	 * @return
	 */
	public Emp getEmpS(Integer empId){
		return er.findOne(empId);
	}
	/**
	 * 删除
	 */
	public void deleteEmp(Integer empId){
		er.delete(empId);
	}
	/**
	 * 修改
	 * @param id
	 * @param name
	 * @param sal
	 */
	public void updataEmp(int id,String name,int sal){
		Emp emp=new Emp();
		emp.setId(id);
		emp.setEname(name);
		emp.setSal(sal);
		er.save(emp);
	}
	
}
