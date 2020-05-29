/*  Name: Ng Ying Lung
	No.: 150130141
	Class: IT114103/1C
	Program: Employee
*/
import java.io.*;
import java.util.*;

public abstract class Employee implements Serializable{ //this is an abstract class
	private String staffID,name,gender,mobileNo,post;
	private String address="";
	private int age,salary;
	protected int mpf;
	//constructor of Employee
	public Employee(String staffID,String name,int age,String gender,String mobileNo,String post,String address,int salary,int mpf){
		this.staffID=staffID;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.mobileNo=mobileNo;
		this.post=post;
		this.address=address;
		setSalary(salary);
		this.mpf=mpf;
	}
	//getter of staffID
	public String getStaffID(){
		return staffID;
	}
	//getter of name
	public String getName(){
		return name;
	}
	//getter of gender
	public String getGender(){
		return gender;
	}
	//getter of age
	public int getAge(){
		return age;
	}
	//getter of mobileNo
	public String getMobileNo(){
		return mobileNo;
	}
	//getter of post
	public String getPost(){
		return post;
	}
	//getter of address
	public String getAddress(){
		return address;
	}
	//getter of salary
	public int getSalary(){
		return salary;
	}
	//getter of mpf
	public int getMpf(){
		return mpf;
	}
	//setter of salary
	public void setSalary(int salary){
		this.salary=salary;
	}
	//check whether one or more characters of this employee's name match with nameCheck or not
	public boolean isName(String nameCheck){
		boolean temp3 = true;
		int count = 0;
		while(temp3==true||count<nameCheck.length()){
			String temp1 = nameCheck.valueOf(nameCheck.charAt(count));
			String temp2 = name.valueOf(name.charAt(count));
			if(temp1.equalsIgnoreCase("?") || temp1.equalsIgnoreCase(temp2)){
				temp3 = true;
			}else{
				temp3 = false;
				break;
			}
			count++;
		}
		return temp3;
	}
	//getter of district of employee's address

	public String getDistrict(){
		StringTokenizer st = new StringTokenizer (address,",");
		int tokenno = st.countTokens();
		for(int i=0;i<tokenno-2;i++){
			st.nextToken();
		}
		String district = st.nextToken();
		return district;
	}
	//check if this employee's district is the samae as districtCheck or not
	public boolean isDistrict(String districtCheck){
		if(districtCheck.equalsIgnoreCase(getDistrict())){
			return true;
		}else{
			return false;
		}
	}
	//abstract method of increaseSalary
	public abstract void increaseSalary(double percentage);
}
