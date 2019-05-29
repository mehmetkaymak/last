import java.util.ArrayList;

public class EmployeeList {
public static void main(String[] args) {
	Employee e1= new Employee();
	e1.age=57;
	e1.salary=25.0;
	e1.name= "maho";
	
	//pass by reference
	Employee e3 = e1;
	//e3.name="memo";
	System.out.println(e1.name);



	
	
	
	
	
	
	int i = 10;
	int j = i;
	j =100;
	System.out.println(i);
	
	e1.info();
	
	Employee e2= new Employee();
	
	e2.age=55;
	e2.salary=290.0;
	e2.name= "mahomoll";
	
	ArrayList<Employee> myEmployees = new ArrayList<>();
	
	myEmployees.add(e1);
	myEmployees.add(e2);
	myEmployees.add(new Employee());
	System.out.println(myEmployees.size());
	System.out.println(myEmployees.get(2).age);


String names= "";	
	for( Employee item :  myEmployees) {
	if(item.age>50) 
	names += item.name +", ";
	}
	//names = names.re
	System.out.println(names);
	}
}



	

