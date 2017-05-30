package ses5asi3;


	
	
	public class Main{
		public static void main(String[] args) {
			Employee ob1=new PermanentEmp(20,"Akash",30,30000);
			System.out.println("Permanent Employee Details");
			System.out.println("Employee Name="+ob1.empname);
			System.out.println("Employee Id="+ob1.empID);
			System.out.println("Leaves="+ob1.total_leaves);
			ob1.calculate_balance_leaves();
			ob1.avail_leave(20, (char) 0);
			ob1.calculate_salary();
			System.out.println("------------------------------------------------------------------");
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


