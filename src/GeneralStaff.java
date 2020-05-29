/*  Name: Ng Ying Lung
	No.: 150130141
	Class: IT114103/1C
	Program: GeneralStaff
*/
import java.io.*;

public class GeneralStaff extends Employee implements Serializable{
	private int bonus;
	//constructor of GeneralStaff
	public GeneralStaff(String staffID,String name,int age,String gender,String mobileNo,String post,String address,int salary,int mpf,int bonus){
		super(staffID,name,age,gender,mobileNo,post,address,salary,mpf);
		this.bonus=bonus;
	}
	//getter of bonus
	public int getBonus(){
		return bonus;
	}
	//calculate for increase of salary
	public void increaseSalary(double percentage){
		super.setSalary((int)(super.getSalary()*percentage));
		mpf=(int)(mpf*percentage);
		bonus=(int)(bonus*percentage);
	}
}
