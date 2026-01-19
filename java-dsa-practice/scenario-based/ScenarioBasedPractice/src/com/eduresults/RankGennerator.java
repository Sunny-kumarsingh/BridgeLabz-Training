package com.eduresults;

public class RankGennerator {
	
	private MergeSort sorter = new MergeSort();
	
	public void generateRankSheet(Student[] students) {
		sorter.sort(students);
		printRankSheet(students);
		
	}
	
	private void printRankSheet(Student[] students) {
		System.out.println(" List of Students ");
		int rank = 1;
		
		for (Student s : students) {
            System.out.println(
                rank++ + ". " +
                s.getName() + " | " +
                s.getMarks() + " | " +
                s.getDistrict()
            );
		}
	}
	
	
}
