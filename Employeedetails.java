package week1.day4;

public class Employeedetails {
	
	public void getEmployeeNameandId(String empname , int empId) {
		System.out.println("Name;" + empname);
		System.out.println("ID"+empId);
	}
	
	public void getEmployeeAddress(String empaddress) {
		System.out.println("Address;" + empaddress);
	}
	
	public void printEmployeeSalary(double empsalary) {
		System.out.println("Salary;" + empsalary);
	}
	
	public void printEmployeeMobileNumber(long mobNum) {
		System.out.println("Mobile number;" + mobNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employeedetails details = new Employeedetails();
		details.getEmployeeNameandId("chenthilsp", 9876);
		details.getEmployeeAddress("chennai");
		details.printEmployeeSalary(125000);
		details.printEmployeeMobileNumber(7338886975L);

	}

}
