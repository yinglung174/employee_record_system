/*  Name: Ng Ying Lung
	No.: 150130141
	Class: IT114103/1C
	Program: IncreaseSalary
*/
public class IncreaseSalary {

	public static void main(String args[]){
		//define three employees attributes
		  Employee emp[] = new Employee[3];
		  String output = "";
           emp[0] = new Manager("M000003","CHIU Shun Kin",33,"Male","95515368",
							"HR Manager","Room B,27/F,234 Chu Wing Street,Hung Hom,Kowloon",
							115000,5750,11500,11500);
		   emp[1] = new GeneralStaff("G000001","AU Chi Shing",22,"Male","NA","Engineer",
		                     "Flat A,15/F,332 Mei Yi Street,Kowloon Tong,Kowloon",50000,2500,5000);
		   emp[2] = new Manager("M000001","CHUNG Man Han",55,"Male","98340485","General Manager",
		   					"Room D,16/F,37 Mei Yi Street,Kowloon Tong,Kowloon",150000,7500,15000,15000);
		  //increase the salary for all employees
		   for(int d = 0; d < emp.length; d++){
			   emp[d].increaseSalary(1.1);
		   }
		   System.out.println("The sample records of the employees are shown below:");
		   //output the employees data after increase of salary
		   for(int i = 0; i < emp.length; i++) {
			   if (emp[i].getStaffID().startsWith("M")) {
			      System.out.println(" sample record "+ (i+1)+ ":"+ emp[i].getStaffID()+","+emp[i].getName()+","+emp[i].getAge()+","+emp[i].getGender()+","+emp[i].getMobileNo()+
			                     ","+ emp[i].getPost()+","+emp[i].getAddress()+","+emp[i].getSalary()+","+emp[i].getMpf() +","+ ((Manager)emp[i]).getHouseAllow() +","+ ((Manager)emp[i]).getTravelAllow()+"\n");
				 }
			   else {
			     System.out.println(" sample record "+ (i+1)+ ":"+ emp[i].getStaffID()+","+emp[i].getName()+","+emp[i].getAge()+","+emp[i].getGender()+","+emp[i].getMobileNo()+
			                     ","+ emp[i].getPost()+","+emp[i].getAddress()+","+emp[i].getSalary()+","+emp[i].getMpf() +","+((GeneralStaff)emp[i]).getBonus()+"\n");
				 }


		  }

		}
	}