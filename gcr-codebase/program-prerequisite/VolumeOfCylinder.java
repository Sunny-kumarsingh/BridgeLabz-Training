import java.util.*;
class VolumeOfCylinder{
	public static void main(String args[]){
		System.out.println("Enter the value of radius and height");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int h = sc.nextInt();
		int vol = r * r * h * (22/7);
		System.out.println(vol);
	}	
}