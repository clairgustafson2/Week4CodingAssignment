import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> employeeNames = new ArrayList<String>();
			employeeNames.add("Bob Smith");
			employeeNames.add("Sally Johnson");
			employeeNames.add("Clair Gustafson");
			employeeNames.add("Clover Meyer");
			employeeNames.add("Finn Jackson");
		
		Set<Integer> ids = new HashSet<Integer>();
			ids.add(12345);
			ids.add(23456);
			ids.add(75396);
			ids.add(82455);
			ids.add(40119);
			
		Map<Integer,String> employeeMap = new HashMap<Integer, String>();
		
		int i =0;
		
		for (int id : ids) {	
			employeeMap.put(id, employeeNames.get(i++));
		}
		
		Set<Integer> employeeKeys = employeeMap.keySet();
		
		for (int key : employeeKeys) {
			System.out.println(key + " " + employeeMap.get(key));
			
		}
		
		StringBuilder idsBuidler = new StringBuilder();
		for (int id : ids) {
			idsBuidler.append(id + "-");
		}
		
		System.out.println(idsBuidler.toString());
		
		StringBuilder namesBuilder = new StringBuilder();
		for (String employeeName : employeeNames) {
			namesBuilder.append(employeeName + " ");
		}
		System.out.println(namesBuilder.toString());
	}

}
