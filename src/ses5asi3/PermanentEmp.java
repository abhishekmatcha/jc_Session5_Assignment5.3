package ses5asi3;

	public class PermanentEmp extends Employee {
	PermanentEmp(int id, String name, int total, double sal) {
			super(id, name, total, sal);
			
		}

	int paid_leave=8,sick_leave=5,casual_leave=4;
	double basic=10000,hra=5000,pfa=2000;
		void print_leave_details(){
			System.out.println("Paid Leave"+paid_leave+"Sick Leave="+sick_leave+"Casual Leave="+casual_leave);
		}
		void calculate_balance_leaves() {
			int total=total_leaves-(paid_leave+sick_leave+casual_leave);
			System.out.println("Leave Balance ="+total);
		}

		boolean avail_leave(int no_of_leaves, char type_of_leave) {
			if(no_of_leaves<total_leaves)
				return true;
			else
				return false;
		}

		void calculate_salary() {
			double hra=0.5f*basic;
			double da=0.2f*basic;
			double totalsalary=total_salary+(hra+da)-pfa;
			System.out.println("Salary="+totalsalary);
			
			
		}

	}


	

