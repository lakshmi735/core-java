package hospitalappabs;

import java.util.Scanner;

import hospitalappabs.exception.EmailNotFoundException;
import hospitalappabs.hospital.ApolloHospitalImpl;
import hospitalappabs.hospital.Hospital;
import hospitalappabs.patient.Patient;



public class HospitalTester {
	public static void main(String a[])
	{
		
		System.out.println("The Main Method Started...");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size=sc.nextInt();
		Hospital hospital=new ApolloHospitalImpl(size);
		
		for(int i=0;i<size;i++)
		{
			Patient patient=new Patient();
		  System.out.println("Enter the Patient Id");
		  patient.setPatientId(sc.nextInt());
		  
		  System.out.println("Enter the patient Name");
		  patient.setPatientName(sc.next());
		  
		  System.out.println("Enter the Address of the Patient");
		  patient.setAddress(sc.next());
		  
		  System.out.println("Enter the Age of the Patient");
		  patient.setAge(sc.nextInt());
		  
		  System.out.println("Enter the Contact Number of the Patient");
		  patient.setContactNo(sc.nextLong());
		  
		  System.out.println("Enter the Email id of the Patient");
		  patient.setEmail(sc.next());
		  
		  System.out.println(patient.getPatientId() + " " +patient.getPatientName() + " " +patient.getAddress() + " " +patient.getContactNo()+ " " +patient.getAge() + " " +patient.getEmail());
		  
		  hospital.admit(patient);
		  
		  
		}
		hospital.getAllPatients();
		hospital.getPatientByAge(35);
		hospital.getPatientByAddress("bangalore");
		try
		{
			hospital.getPatientByEmail("lakshmi@gamil.com");
			
		}catch(EmailNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		/*String answer ="yes";
		
		do {
		System.out.println("Enter 1 to fetch all the patient");
		System.out.println("Enter 2 to fetch patient by id");
		System.out.println("Enter 3 to update patient by patient name");
		System.out.println("Enter 4 to exit");
		int option=sc.nextInt(); //option=sc.nextInt();
		
		
		switch(option)
		{
		case 1:hospital.getAllPatients();
		break;
		case 2:
			System.out.println("Enter the ide to be fetched");
			int id=sc.nextInt();
			hospital.getPatientByPatientId(id);
			break;
		case 3:
			System.out.println("Enter the updated age ");
			int updateAge=sc.nextInt();
			System.out.println("Enter the patient name");
			String name=sc.next();
			hospital.updatePatientAgeByPatientName(updateAge, name);
			break;
		case 4:
			System.out.println("thank you for visting");
			break;
		default:
			System.out.println("please Enter the valid number");
		
		}
		System.out.println("do you want to continue yes or no");
		//answer=sc.next();
		}while(answer.equals(sc.next())); //while("Yes".equals(answer));
		*/

	System.out.println("main ended");
	sc.close();

	}

}
