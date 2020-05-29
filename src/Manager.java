/*  Name: Ng Ying Lung
	No.: 150130141
	Class: IT114103/1C
	Program: Manager
*/
import java.io.*;

public class Manager extends Employee implements Serializable{
	private int houseAllow;
	private int travelAllow;
	//constructor of Manager
	public Manager(String staffID,String name,int age,String gender,String mobileNo,String post,String address,int salary,int mpf,int houseAllow,int travelAllow){
		super(staffID,name,age,gender,mobileNo,post,address,salary,mpf);
		this.houseAllow = houseAllow;
		this.travelAllow = travelAllow;
	}
	//getter of houseAllow
	public int getHouseAllow(){
		return houseAllow;
	}
	//getter of travelAllow
	public int getTravelAllow(){
		return travelAllow;
	}
	//calculate for increase of salary
	public void increaseSalary(double percentage){
		super.setSalary((int)(super.getSalary()*percentage));
		mpf=(int)(mpf*percentage);
		houseAllow=(int)(houseAllow*percentage);
		travelAllow=(int)(travelAllow*percentage);
	}
}
