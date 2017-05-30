package ses5asi3;



	public class TemporaryEmp extends Employee {

		TemporaryEmp(int id, String name, int total, double sal) {
			super(id, name, total, sal);
		}
		int paid_leave=3,sick_leave=5,casual_leave=3;
		void calculate_balance_leaves() {
			int total=total_leaves-(paid_leave+sick_leave+casual_leave);
			System.out.println("leave balance"+total);
		}

		boolean avail_leave(int no_of_leaves, char type_of_leave) {
			if(no_of_leaves<total_leaves)
				return true;
			else
				return false;
		}

		void calculate_salary() {
			float hra=(float) 30.50;
			int rate = 1000;
			double totalsalary=hra*rate;
			System.out.println("Salary="+totalsalary);
			
		}

	}

	

