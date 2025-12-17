public DivideEqually{
	public static void main(String args[]){
		int stu = 3;
		int pen = 14;
		int remainingPen = (pen)%3;
		int quantityPen = pen/3;
		
		System.out.println("The Pen Per student is " + quantityPen + " and the remaining pen not distributed is " + remainingPen);
	}
}