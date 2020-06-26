import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList of String called employeeNames. Added five entries
		List<String> employeeNames = new ArrayList<String>();
			employeeNames.add("Bob Smith");
			employeeNames.add("Sally Johnson");
			employeeNames.add("Clair Gustafson");
			employeeNames.add("Clover Meyer");
			employeeNames.add("Finn Jackson");
		
		//HashSet of Integer called ids. Added five entries
			Set<Integer> ids = new HashSet<Integer>();
			ids.add(12345);
			ids.add(23456);
			ids.add(75396);
			ids.add(82455);
			ids.add(40119);
		
		// HashMap of Integer and String called employeeMap
		Map<Integer,String> employeeMap = new HashMap<Integer, String>();
		
		int i =0;
		
		//Increment i so that each iteration grabs the next element in the ArrayList.
		for (int id : ids) {	
			employeeMap.put(id, employeeNames.get(i++));
		}
		Set<Integer> employeeKeys = employeeMap.keySet();
		
		//Use the key for each current iteration to print to the console both the current key and its associated value in the map.
		for (int key : employeeKeys) {
			System.out.println(key + " " + employeeMap.get(key));	
		}
		
		// Create string builder and iterate over the ids HashSet and append each id, followed by a dash “-“ to idsBuilder
		StringBuilder idsBuilder = new StringBuilder();
		for (int id : ids) {
			idsBuilder.append(id).append("-");
		}
		idsBuilder.deleteCharAt(idsBuilder.length()-1);
		System.out.println(idsBuilder.toString());
		
		//Create string builder called namesBuilder. Iterate over the employeeNames ArrayList and append each name, followed by a space
		StringBuilder namesBuilder = new StringBuilder();
		for (String employeeName : employeeNames) {
			namesBuilder.append(employeeName + "  ");
		}
		System.out.println(namesBuilder.toString());
	}

}
