/*  Name: Ng Ying Lung
	No.: 150130141
	Class: IT114103/1C
	Program: TestSystem
*/
import java.io.*;
import javax.swing.*;

public class TestSystem {

	public static void main(String args[]){
		//This is the polymorhpism method of emp[] depend on emp[i] object how to define
		  Employee emp[] = new Employee[2];
		  String output = "";
           emp[0] = new Manager("M000003","CHIU Shun Kin",33,"Male","95515368",
							"HR Manager","Room B,27/F,234 Chu Wing Street,Hung Hom,Kowloon",
							115000,5750,11500,11500);
		   emp[1] = new GeneralStaff("G000001","AU Chi Shing",22,"Male","NA","Engineer",
		                     "Flat A,15/F,332 Mei Yi Street,Kowloon Tong,Kowloon",50000,2500,5000);

		//Output for employees' data
		   for(int i = 0; i < 2; i++) {
			   if (emp[i].getStaffID().startsWith("M")) {
			      output += " sample record "+ (i+1)+ ":"+ emp[i].getStaffID()+","+emp[i].getName()+","+emp[i].getAge()+","+emp[i].getGender()+","+emp[i].getMobileNo()+
			                     ","+ emp[i].getPost()+","+emp[i].getAddress()+","+emp[i].getSalary()+","+emp[i].getMpf() +","+ ((Manager)emp[i]).getHouseAllow() +","+ ((Manager)emp[i]).getTravelAllow()+"\n";
				 }
			   else {
			      output += " sample record "+ (i+1)+ ":"+ emp[i].getStaffID()+","+emp[i].getName()+","+emp[i].getAge()+","+emp[i].getGender()+","+emp[i].getMobileNo()+
			                     ","+ emp[i].getPost()+","+emp[i].getAddress()+","+emp[i].getSalary()+","+emp[i].getMpf() +","+((GeneralStaff)emp[i]).getBonus()+"\n";
				 }


		  }
		   JOptionPane.showMessageDialog(null,"The sample records of the employees are shown below:\n"+output);
           System.exit(0);

		}
	}