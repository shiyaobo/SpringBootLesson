package cn.et.lesson01.service;

import java.util.Map;

public interface EmpService {
	public String saveEmp();
	public Map getEmp(Integer empId);
	public void deleteEmp(Integer empId);
}
