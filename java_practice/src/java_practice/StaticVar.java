package java_practice;

//public class StaticVar {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Family family = new Family("Razaq","Akinsanya", 25);
		System.out.println(family.getFname());
		System.out.println();
		System.out.println(Family.getLname());
		System.out.println();
		System.out.println(family.getAge());
		System.out.println();

	}

}

class Family{
	
	String fname;
	static String lname;
	int age;
	public Family(String fname, String lname, int age){
		this.fname = fname;
		Family.lname = lname;
		this.age = age;
		
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public static String getLname() {
		return lname;
	}
	public static void setLname(String lname) {
		Family.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	*/


    public class Member{
	public static void main(String[] args){

			  
	 Members myMemebers1 = new Members("Agbomola","lafenwa");
	 Members myMemebers2 = new Members("Agbomola","lafenwa");
	 Members myMemebers3 = new Members("Agbomola","lafenwa");


}

	}			



			

			public class Members{
			 private String first;
			 private String last;
			 private static int Members = 0;

			 public Members(String fn,String ln){
			 first = fn;
			 last = ln;
			 Members++;

			 System.out.printf("Constructor for % %,members in the club: %d\n",first,last,Members);




			}


			}
			     
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		