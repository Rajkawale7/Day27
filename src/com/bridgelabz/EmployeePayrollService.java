package com.bridgelabz;
import java.util.*;

public class EmployeePayrollService {
	public enum IOService {Console_IO, file_IO, DB_IO, Rest_IO}
	private List<EmployeePayrollData>employeePayrollList;
	public EmployeePayrollService() {}
	public EmployeePayrollService(List<EmployeePayrollData>emploeePayrollList) {}
	
	public static void main(String[] args) {
		ArrayList <EmployeePayrollData>employeePayrollList = new ArrayList<>();
		EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
		Scanner consoleInputReader = new Scanner(System.in);
		employeePayrollService.readEmployeePayrollData(consoleInputReader);
		employeePayrollService.writeEmployeePayrollData();
		}
	
	private void readEmployeePayrollData(Scanner consoleInputReader) {
		System.out.println("Enter Employee ID: ");
		int id = consoleInputReader.nextInt();
		
		System.out.println("Enter Employee Name: ");
		String name = consoleInputReader.next();
		
		System.out.println("Enter Employee Salary: ");
		double salary = consoleInputReader.nextDouble();
		
		employeePayrollList.add(new EmployeePayrollData(id, name, salary));
	}
	private void writeEmployeePayrollData() {
	System.out.println("\n Writing Employee Payroll Roaster to console\n" + employeePayrollList);
	}
}
