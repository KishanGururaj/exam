package com.wolken.wolkenapp.exam;

public class Exam {
	
	private String code;
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public HallTicket getHallticket() {
		return hallticket;
	}

	public void setHallticket(HallTicket hallticket) {
		this.hallticket = hallticket;
	}

	private  int fees;
	private HallTicket hallticket;
	
	public boolean allow(HallTicket hallticket) {
		System.out.println("inside allow method ");
		boolean check =false; 
		
		if (fees>1000)
		{	check =true ;
			if (hallticket !=null) {
				this.hallticket=hallticket;
				this.hallticket.displayInfo();
			}
			else {
				System.out.println("No HallTicket found ");
			}
		}else {
			System.out.println("Please pay the fees");
		}
		System.out.println("end of condition ");
		return check;
	
	}
	
	
	
	
}
