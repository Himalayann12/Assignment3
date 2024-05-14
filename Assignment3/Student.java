package Assignment3;

   class Student {
	    String name;
	    int rollNumber;
	    String phoneNumber;
	    String address;
	
	    public static void main(String[] args) {
	        Student sam = new Student();
	        sam.name = "Sam";
	        sam.rollNumber = 10;
	        sam.phoneNumber = "984535453";
	        sam.address = "Tulsipur";

	        Student john = new Student();
	        john.name = "John";
	        john.rollNumber = 12;
	        john.phoneNumber = "9845345345";
	        john.address = "Tulsipur";

	        System.out.println("Details of Sam:\n");
	        
	        System.out.println("Name: " + sam.name);
	        System.out.println("Roll Number: " + sam.rollNumber);
	        System.out.println("Phone Number: " + sam.phoneNumber);
	        System.out.println("Address: " + sam.address);
	        System.out.println();

	        System.out.println("Details of John:\n");
	        
	        System.out.println("Name: " + john.name);
	        System.out.println("Roll Number: " + john.rollNumber);
	        System.out.println("Phone Number: " + john.phoneNumber);
	        System.out.println("Address: " + john.address);
	    }
	}


