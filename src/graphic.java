/*  Name: Ng Ying Lung
	No.: 150130141
	Class: IT114103/1C
	Program: graphic
*/
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;


public class graphic extends JFrame{
	private JPanel panel;
	private JTextField fStaffID;
	private JTextField fName;
	private JTextField fAge;
	private JTextField fGender;
	private JTextField fMobileNo;
	private JTextField fPost;
	private JTextField fAddress;
	private JTextField fSalary;
	private JTextField fMPF;
	private JTextField fBonus;
	private JTextField fHA;
	private JTextField fTA;
	private JButton bM,bGS,bSR;
	private JLabel label;
	private JLabel lStaffID,lName,lAge,lGender,lMobileNo,lPost,lAddress,lSalary,lMPF,lBonus,lHA,lTA;
	Employee emp2[] = new Employee[10];

	//set up GUI
	public graphic(){
		super("Employee Record System");

		Container panel = getContentPane();
		panel.setLayout( new FlowLayout() );
		// create Label & Text Field for input
				lStaffID = new JLabel("StaffID:");
				fStaffID = new JTextField(28);
				panel.add(lStaffID);
				panel.add( fStaffID );		// Add staffID to panel
				lName = new JLabel("Name:");
				fName = new JTextField(30);
				panel.add(lName);
				panel.add( fName );		// Add Name to panel
				lAge = new JLabel("Age:");
				fAge = new JTextField(30);
				panel.add(lAge);
				panel.add( fAge );		// Add Age to panel
				lGender = new JLabel("Gender:");
				fGender = new JTextField(28);
				panel.add(lGender);
				panel.add( fGender );		// Add Gender to panel
				lMobileNo = new JLabel("MobileNo:");
				fMobileNo = new JTextField(28);
				panel.add(lMobileNo);
				panel.add( fMobileNo );		// Add MobileNo to panel
				lPost = new JLabel("Post:");
				fPost = new JTextField(28);
				panel.add(lPost);
				panel.add( fPost );		// Add Post to panel
				lAddress = new JLabel("Address:");
				fAddress = new JTextField(28);
				panel.add(lAddress);
				panel.add( fAddress );		// Add Address to panel
				lSalary = new JLabel("Salary:");
				fSalary = new JTextField(28);
				panel.add(lSalary);
				panel.add( fSalary );		// Add Salary to panel
				lMPF = new JLabel("MPF:");
				fMPF = new JTextField(28);
				panel.add(lMPF);
				panel.add( fMPF );		// Add MPF to panel
				lBonus = new JLabel("Bonus:");
				fBonus = new JTextField(28);
				panel.add(lBonus);
				panel.add( fBonus );		// Add Bonus to panel
				lHA = new JLabel("Housing Allowance:");
				fHA = new JTextField(22);
				panel.add(lHA);
				panel.add( fHA );		// Add HousingAllowance to panel
				lTA = new JLabel("Travelling Allowance:");
				fTA = new JTextField(22);
				panel.add(lTA);
				panel.add( fTA );		// Add TravellingAllowance to panel

				//create buttons
				bM = new JButton("Add manager");
				panel.add(bM);
				bGS = new JButton("Add generalStaff");
				panel.add(bGS);
				bSR = new JButton("Show Record");
				panel.add(bSR);

			//register event handlers
			TextFieldHandler handler = new TextFieldHandler();
			fStaffID.addActionListener( handler );
			fName.addActionListener( handler );
			fAge.addActionListener( handler );
			fGender.addActionListener( handler );
			fMobileNo.addActionListener( handler );
			fPost.addActionListener( handler );
			fAddress.addActionListener( handler );
			fSalary.addActionListener( handler );
			fMPF.addActionListener( handler );
			fBonus.addActionListener( handler );
			fHA.addActionListener( handler );
			fTA.addActionListener( handler );
			bM.addActionListener( handler);
			bGS.addActionListener( handler);
			bSR.addActionListener( handler);


			setSize(400,500);
			setVisible( true );
	}
	//execute application
	public static void main(String [] args){
		graphic application = new graphic();
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
	//private inner class for event handling
	private class TextFieldHandler implements ActionListener{
		//process text field events
		public void actionPerformed( ActionEvent event){
			String sStaffID,sName,sGender,sMobileNo,sPost,sAddress;
			int sAge,sSalary,sMPF,sHA,sTA,sBonus;
			 if ( event.getSource() == bM){ //Manager Button Event
				 try{
				 		sStaffID = fStaffID.getText();
				 		sAge = Integer.parseInt(fAge.getText());
				 		sName = fName.getText();
				 		sGender = fGender.getText();
				 		sMobileNo = fMobileNo.getText();
				 		sPost = fPost.getText();
						 sAddress = fAddress.getText();
				 		sSalary = Integer.parseInt(fSalary.getText());
				 		sMPF = Integer.parseInt(fMPF.getText());
				 		sHA = Integer.parseInt(fHA.getText());
						 sTA = Integer.parseInt(fTA.getText()); //get value
						 if(sAge<=0 || sAge>=120 || sAge<0 || sMPF<0 || sHA<0 || sTA<0 || sSalary<0){
							 throw new ArithmeticException();     //Exception handling
						 }
						 if( sStaffID.startsWith("G")){
							 throw new ArrayIndexOutOfBoundsException();
						 }
						 if(!sStaffID.startsWith("M")){
							 throw new NumberFormatException();
						 }
				}catch(ArrayIndexOutOfBoundsException e){
					JOptionPane.showMessageDialog( null,"It should be GeneralStaff record.\nHint : Please check StaffID or irrelevant field.");
					return;
				}catch(NumberFormatException e){
					JOptionPane.showMessageDialog( null,"Please input correct format!!\nHint: StaffID should start with 'M' & Correct value.");
					return;
				}catch(ArithmeticException e){
					JOptionPane.showMessageDialog( null,"Please input correct number!\nHint: Pay attention to negative number & Correct age.");
					return;
				}catch(Exception e){
					JOptionPane.showMessageDialog( null,"Something wrong!\nPlease input correctly again!");
					return;
				}

				 for(int i =0; i<emp2.length;i++){       //ObjectOutputStream
					 if(emp2[i]==null){
				 emp2[i] = new Manager(sStaffID,sName,sAge,sGender,sMobileNo,sPost,sAddress,sSalary,sMPF,sHA,sTA);

				 try {
				 			ObjectOutputStream oos = new ObjectOutputStream(
				 					new FileOutputStream(new File("RefData.dat")));
				 			oos.writeObject(emp2);
				 			oos.close();
				 		}
				 		catch (IOException e) {         //Exception Handling
				 			System.out.println("Error : " + e);
				 		}
			 	JOptionPane.showMessageDialog( null,"Added: " + emp2[i].getStaffID()+";"+emp2[i].getName()+";"+emp2[i].getAge()+";"+emp2[i].getGender()
			 	+","+emp2[i].getMobileNo()+";"+emp2[i].getPost()+";"+emp2[i].getAddress()+";"+emp2[i].getSalary()+";"+emp2[i].getMpf()+";"
			 	+((Manager)emp2[i]).getHouseAllow()+";"+((Manager)emp2[i]).getTravelAllow());
			 		break; //Output
					}
				}
			}
			 if ( event.getSource() == bGS){  //GeneralStaff Button Event
				 		try{
							 sStaffID = fStaffID.getText();
							 sAge = Integer.parseInt(fAge.getText());
							 sName = fName.getText();
							 sGender = fGender.getText();
							 sMobileNo = fMobileNo.getText();
							 sPost = fPost.getText();
							 sAddress = fAddress.getText();
							 sSalary = Integer.parseInt(fSalary.getText());        //get values
							 sMPF = Integer.parseInt(fMPF.getText());
							 sBonus = Integer.parseInt(fBonus.getText());
							 if(sAge<=0 || sAge>=120 || sAge<0 || sMPF<0 || sBonus<0 || sSalary<0){
							 	 throw new ArithmeticException();
							 }
							 if( sStaffID.startsWith("M")){
							 	 throw new ArrayIndexOutOfBoundsException();
							  }
							 if(!sStaffID.startsWith("G")){
							 		 throw new NumberFormatException();       //Exception Handling
							  }
							}catch(ArrayIndexOutOfBoundsException e){
												JOptionPane.showMessageDialog( null,"It should be Manager record.\nHint : Please check StaffID or irrelevant field.");
												return;
							}catch(NumberFormatException e){
												JOptionPane.showMessageDialog( null,"Please input correct format!!\nHint: StaffID should start with 'G' & Correct value.");
												return;
							}catch(ArithmeticException e){
												JOptionPane.showMessageDialog( null,"Please input correct number!\nHint: Pay attention to negative number & Correct age.");
												return;
							}catch(Exception e){
												JOptionPane.showMessageDialog( null,"Something wrong!\nPlease input correctly again!");
												return;
							}
							 for(int i =0; i<emp2.length;i++){    //ObjectOutputStream
								 if(emp2[i]==null){
							 emp2[i] = new GeneralStaff(sStaffID,sName,sAge,sGender,sMobileNo,sPost,sAddress,sSalary,sMPF,sBonus);

							 try {
							 			ObjectOutputStream oos = new ObjectOutputStream(
							 					new FileOutputStream(new File("RefData.dat")));
							 			oos.writeObject(emp2);
							 			oos.close();
							 		}
							 		catch (IOException e) {            //IOException Handling
							 			System.out.println("Error : " + e);
							 		}
						 	JOptionPane.showMessageDialog( null,"Added: " + emp2[i].getStaffID()+";"+emp2[i].getName()+","+emp2[i].getAge()+";"+emp2[i].getGender()
			 	+","+emp2[i].getMobileNo()+";"+emp2[i].getPost()+";"+emp2[i].getAddress()+";"+emp2[i].getSalary()+";"+emp2[i].getMpf()+";"+((GeneralStaff)emp2[i]).getBonus());
						 		break;  //Output
								}
							}
			}
			 if ( event.getSource() == bSR){      //Show Record Button Event
				 String output="";
				 						try{    //ObjectInputStream
				 						ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("RefData.dat")));
				 						emp2 =(Employee[])ois.readObject();
				 						for(int i=0;i<emp2.length;i++){
											if(emp2[i]!=null){
											if(emp2[i].getStaffID().startsWith("M")){
				 								output+="Record "+(i+1)+" :"+emp2[i].getStaffID()+";"+emp2[i].getName()+";"+emp2[i].getAge()+";"+emp2[i].getGender()
			 	+","+emp2[i].getMobileNo()+";"+emp2[i].getPost()+";"+emp2[i].getAddress()+";"+emp2[i].getSalary()+";"+emp2[i].getMpf()+";"+((Manager)emp2[i]).getHouseAllow()+";"+((Manager)emp2[i]).getTravelAllow()+"\n";
				 							}
				 							if(emp2[i].getStaffID().startsWith("G")){
												output+="Record "+(i+1)+" :"+emp2[i].getStaffID()+";"+emp2[i].getName()+","+emp2[i].getAge()+";"+emp2[i].getGender()
			 	+","+emp2[i].getMobileNo()+";"+emp2[i].getPost()+";"+emp2[i].getAddress()+";"+emp2[i].getSalary()+";"+emp2[i].getMpf()+";"+((GeneralStaff)emp2[i]).getBonus()+"\n";
											}
											}
										}
				 						ois.close();
				 						}catch (Exception e){
				 							System.out.println("Error: "+e);  //Exception Handling
				 			}
							JOptionPane.showMessageDialog(null,"The sample records of the employees are shown below:\n"+output);
			 }                //totally output
		}
	}
}