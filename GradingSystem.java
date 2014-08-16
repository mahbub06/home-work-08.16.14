package com.infix;

public class GradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int studentMark=91;
		if (studentMark>=50 && studentMark<=60){
			System.out.println("D");
		}else if(studentMark>=61 && studentMark<=64){
			System.out.println("C");
		}else if(studentMark>=65 && studentMark<=70){
			System.out.println("B-");
		}else if(studentMark>=71 && studentMark<=74){
			System.out.println("B");
		}else if(studentMark>=75 && studentMark<=80){
			System.out.println("B+");
		}else if(studentMark>=90 && studentMark<=100){
			System.out.println("A");
		}else {
			System.out.println("F");

	}

}
}
