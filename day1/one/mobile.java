package day1.one;

public class mobile {
	
	public int charge=100;
	String Model="Samsung";
	
	public String checkOperator(String operator) {
		String Hello=operator + " Network";
		return Hello;
	}
	
	public void sendMessage() {
		System.out.println("Hai");
	}
	
	public int checkCharge() {
		return 80;
		
	}
	
	public void saveContact(String phoneNumber) {
		
		if (phoneNumber=="+919791662996") {
			
			System.out.println("Santhanam");
			
		}else if (phoneNumber=="+919791662997") {
			System.out.println("Kumar");
			
		}else if (phoneNumber=="+919791662998") {
			System.out.println("Hari");
			
		}else if (phoneNumber=="+919791662999") {
			System.out.println("Mani");
			
		}else if (phoneNumber=="+919791662995") {
			System.out.println("Mathan");
			
		}else {
			System.out.println("UNKNOWN");
		}
	}
	public void saveContact1(String phoneNumber) {
		switch (phoneNumber) {
		case "+919791662996":
			System.out.println("Santhanam");
			break;
		case "+919791662997":
			System.out.println("Kumar");
			break;
		case "+919791662998":
			System.out.println("Hari");
			break;
		case "+919791662999":
			System.out.println("Mani");
			break;
		case "+919791662991":
			System.out.println("Mathan");
			break;
		default:
			System.out.println("UNKNOWN");
			break;
		}}
		
		public void savecontact2(String friends)
		{
		if(friends == "Murali") {
			System.out.println("Krishnan");
		}else if(friends == "Madan") {
			System.out.println("Kumar");
		}else if(friends == "Ram") {
			System.out.println("Kumar");
		}else {
			System.out.println("Unknown");	
		}
	}


public void savecontact3(String friends)
{
	switch(friends) {
	case "Murali":                    
		System.out.println("Krishnan");
	break;
	case "Madan":
		System.out.println("Kumar");
		break;
		default:
			System.out.println("UNKNOWN");
			break;
	}
}
}