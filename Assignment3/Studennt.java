
 class Studennt {
	static Integer rollno;
	static String name;
	
	public void Studennt(Integer rollno, String name) {
		this.rollno = rollno;
		this.name = name;
		
	}
	
	public static void main(String[] args) {
		Studennt s = new Studennt();
		s.Studennt(2,"john");

		
		System.out.println("Roll_no is : " + rollno + "\nName is : " + name);
	}

}