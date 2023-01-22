package com.xworkz.showroomapp.showroom;

import com.xworkz.showroomapp.manager.Manager;//FQCN   package+className-->Qualified
//base/parent/base class
public class ShowRoom {
	Manager manager[];
	int index;
	
	public ShowRoom(int size) //constructor
	{
		System.out.println("ShowRoom object is created......");
		 manager=new Manager[size]; //has relationship one to many
		
	}
	public boolean saveManager(Manager manager)
	{
		boolean isSaveManager=false;
		System.out.println("save manager method is started");
		if(manager.getManagerName()!=null && !(manager.getManagerName().isEmpty()))
		{
			this.manager[index++]=manager;
			isSaveManager=true;
		}
		System.out.println("save manager is ended....");
		return isSaveManager;
	}
	public void getAllManager()
	{
		for(int i=0;i<this.manager.length;i++)
		{
			System.out.println(manager[i].getManagerId()+ " " +manager[i].getManagerName() + " " + manager[i].getContactNumber() + " " +manager[i].getQualification() + " " +manager[i].getGender());
		}
	}
	public Manager getManagerByManagerId(int managerId)
	{
		System.out.println("the get manager by manager id started....");
		for(int i=0;i<manager.length;i++)
		{
			if(manager[i].getManagerId()==managerId)
			{
				System.out.println("th managet id is mathing ......proced the data");
				System.out.println(manager[i].getManagerId() + " " +manager[i].getManagerName() + " "+manager[i].getContactNumber()+ " " +manager[i].getQualification()+ " " +manager[i].getGender());
				return manager[i]; //option4
			}
			System.out.println("the get manager by manager id ended....");
		}
		return null;
	}
	public Manager getManagerByManagerName(String managerName)
	{
		System.out.println("the get manager by manager name method started");
		for(int i=0;i<manager.length;i++)
		{
			if(manager[i].getManagerName()==managerName)
			{
				System.out.println("the name of the manger is matching ....proced the data");
				System.out.println(manager[i].getManagerId()+  " " +manager[i].getManagerName() + " " +manager[i].getContactNumber() +  " " +manager[i].getQualification() + " " +manager[i].getGender());
				
			}
			System.out.println("end of the getManagerByManagerName method ");
		}
		return null;
		
	}
	public Manager getManagerByGualification(String qualification)
	{
		System.out.println("the get manager by  qualification is started");
		for(int i=0;i<manager.length;i++)
		{
			if(manager[i].getQualification()==qualification)
			{
				System.out.println("the qualification  is matching ...proced the data");
			
			System.out.println(manager[i].getManagerId()+  " " +manager[i].getManagerName() + " " +manager[i].getContactNumber() +  " " +manager[i].getQualification() + " " +manager[i].getGender());

		}
		System.out.println("end of the getManagerByGualification method ");
	}
	return null;

}
	public boolean updateQualificationByManagerName(String newQualification,String managerName)
	{
		boolean isQualificationUpdated=false;
	
		System.out.println("the updateQualificationByManagerName method started.... ");
		for(int i=0;i<manager.length;i++)
		{
			if(manager[i].getManagerName().equals(managerName))
			{
				System.out.println("the current qualification is " + manager[i].getQualification());
				manager[i].setQualification(newQualification);
				System.out.println("the updated qualification is" +manager[i].getQualification());
		}
	}
		return isQualificationUpdated;
}
	public boolean updateContactById(long newContactNumber,int managerId)
	{
		boolean phoneNumberUpdated=false; 
		for(int i=0;i<manager.length;i++)
		{
			if(manager[i].getManagerId()==managerId)
			{
				System.out.println("the current contact number is " + manager[i].getContactNumber());
				manager[i].setContactNumber(newContactNumber);
				System.out.println("the updated contact Number is" +manager[i].getContactNumber());
				
			}
			
		}
		return phoneNumberUpdated;
	}

}
