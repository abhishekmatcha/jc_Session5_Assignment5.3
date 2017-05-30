package ses5asi3;
	
	
	abstract public class Employee {
		int empID;
		String empname;
		int total_leaves;
		double total_salary;

		Employee(int id,String name,int total,double sal){
			empID=id;
			empname=name;
			total_leaves=total;
			total_salary=sal;
		}

		abstract void calculate_balance_leaves();
		abstract boolean avail_leave(int no_of_leaves, char type_of_leave);
		abstract void calculate_salary();

		}

		