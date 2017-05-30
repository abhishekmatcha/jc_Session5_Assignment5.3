//An abstract class is declared named as Employee.	
	abstract  class Employee 
{
		int empID;
		String empname;
		int total_leaves;
		double total_salary;
		//constructor is defined here.
		Employee(int id,String name,int total,double sal)
		{
			empID=id;
			empname=name;
			total_leaves=total;
			total_salary=sal;
     		}
		//abstract methods of calculating balance leave and salary.
		abstract void calculate_balance_leaves();
		abstract boolean avail_leave(int no_of_leaves, char type_of_leave);
		abstract void calculate_salary();

}

//class is created for permanent employees.
 class PermanentEmp extends Employee 
{
	PermanentEmp(int id, String name, int total, double sal) 
	{
			super(id, name, total, sal);
			
	}

	int paid_leave=8,sick_leave=5,casual_leave=4;
	double basic=10000,hra=5000,pfa=2000;

	//abstract methods are defined here.
		void print_leave_details()
		{
			System.out.println("Paid Leave"+paid_leave+"Sick Leave="+sick_leave+"Casual Leave="+casual_leave);
		}
		void calculate_balance_leaves() 
		{
			int total=total_leaves-(paid_leave+sick_leave+casual_leave);
			System.out.println("Leave Balance ="+total);
		}

		boolean avail_leave(int no_of_leaves, char type_of_leave) 
		{
			if(no_of_leaves<total_leaves)
				return true;
			else
				return false;
		}

		void calculate_salary() 
		{
			double hra=0.5f*basic;
			double da=0.2f*basic;
			double totalsalary=total_salary+(hra+da)-pfa;
			System.out.println("Salary="+totalsalary);
			
			
		}

}

//a class is created for temporary employees.
 class TemporaryEmp extends Employee 
{

		TemporaryEmp(int id, String name, int total, double sal) 
		{
			super(id, name, total, sal);
		}
		int paid_leave=3,sick_leave=5,casual_leave=3;
		void calculate_balance_leaves() 
		{
			int total=total_leaves-(paid_leave+sick_leave+casual_leave);
			System.out.println("leave balance"+total);
		}

		boolean avail_leave(int no_of_leaves, char type_of_leave) 
		{
			if(no_of_leaves<total_leaves)
				return true;
			else
				return false;
		}

		void calculate_salary() 
		{
			float hra=(float) 30.50;
			int rate = 1000;
			double totalsalary=hra*rate;
			System.out.println("Salary="+totalsalary);
			
		}

}
    
//Main class 
class Emp
{
		public static void main(String[] args) 
		{
		
			//employee object is created for permanent employee
			Employee ob1=new PermanentEmp(20,"Akash",30,30000);
			System.out.println("Permanent Employee Details");
			System.out.println("Employee Name="+ob1.empname);
			System.out.println("Employee Id="+ob1.empID);
			System.out.println("Leaves="+ob1.total_leaves);
			ob1.calculate_balance_leaves();
			ob1.avail_leave(20, (char) 0);
			ob1.calculate_salary();
			System.out.println("------------------------------------------------------------------");

			//employee object is created for temporary employee
			Employee ob2=new TemporaryEmp(81,"Lok",30,20000);
			System.out.println("Temorary Employee Details");
			System.out.println("Employee Name="+ob2.empname);
			System.out.println("Employee Id="+ob2.empID);
			System.out.println("Leaves="+ob2.total_leaves);
			ob2.calculate_balance_leaves();
			ob2.avail_leave(20, (char) 0);
			ob2.calculate_salary();
			
			
	}
}



	


		