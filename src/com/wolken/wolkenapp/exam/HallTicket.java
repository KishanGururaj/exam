package com.wolken.wolkenapp.exam;

public class HallTicket {
	public String usn;
	public String subjectCode;
	public String subjectName;
	
	public HallTicket(String usn,String subjectCode ,String subjectName) {
		this.usn=usn;
		this.subjectCode=subjectCode;
		this.subjectName=subjectName;
	}
	
    public void displayInfo() {
    	System.out.println(this.usn);
    	System.out.println(this.subjectCode);
    	System.out.println(this.subjectName);
    }
}
