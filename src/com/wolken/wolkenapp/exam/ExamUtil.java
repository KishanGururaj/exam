package com.wolken.wolkenapp.exam;



public class ExamUtil {

	public static void main(String args[]) {
		Exam exam =new Exam();
		exam.setCode("IS744");
		exam.setFees(1001);
		
		
		HallTicket hallticket= new HallTicket("12345","IS744","signals");
		exam.allow(hallticket); //caller arguments 
		SupplementaryExam supplementaryExam=new SupplementaryExam();
		//Exam supplementaryExam =new SupplementaryExam();----upcasting (polymorphism)
		supplementaryExam.allow(hallticket);
	}
}
