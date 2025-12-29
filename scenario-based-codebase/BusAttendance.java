import java.util.*;

public class BusAttendance{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		String []stuName = new String[10];
		
		System.out.println("Enter the Name of Student :");
		for(int i=0; i<stuName.length; i++){
			stuName[i] = sc.next();
		}
		int present =0;
		int absent =0;
		for(String name : stuName){
			System.out.println(name + " is present or absent");
			String attendance = sc.next();
			if(attendance.equalsIgnoreCase("present")){
				present++;
			}
			else{
				absent++;
			}
		}
		
		System.out.println("total number of students present : " + present );
		System.out.println("total number of students absent : " + absent );
		
	}
}