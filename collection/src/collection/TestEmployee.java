package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestEmployee {

	public static void main(String[] args) {
		Map<String,Employee> emp = accept();
		display(emp);

	}
	public static Map<String,Employee> accept()
	{
		Map<String, Employee> emp=new HashMap<String,Employee>();
		emp.put("001", new Employee("Ram", 1000));
		emp.put("003", new Employee("Sham", 4000));
		emp.put("002", new Employee("Tom", 6000));
		return emp;
	}
	public static void display(Map<String, Employee> emp)
	{
		Set<String> st=emp.keySet();
		
		for(String s:st)
		{
			Employee e=emp.get(s);
			System.out.println(s+"\t==>"+e.getEname()+"\t"+e.getEsal());
		}
	}

}
