package hospitalappabs.patient;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Patient {
	public Patient() {
		// TODO Auto-generated constructor stub
	}
	
	private int patientId;
	private String patientName;
	private String address;
	private int age;
	private long contactNo;
	private String email;
	
	public Patient(int patientId,String patientName,String address,int age,long contactNo,String email)
	{
		this.patientId=patientId;
		this.patientName=patientName;
		this.address=address;
		this.age=age;
		this.contactNo=contactNo;
		this.email=email;
	}

}
