package com.myapp.cloud.domain;

import java.util.Date;


public class Payment {
	
	
	private long trxnid;
	
	private double trxnamount;
	
	private Date trxndate;
	
	public Payment() {
		// TODO Auto-generated constructor stub
	}

	public Payment( double trxnamount, Date trxndate) {

		this.trxnamount = trxnamount;
		this.trxndate = trxndate;
	}

	public long getTrxnid() {
		return trxnid;
	}

	public void setTrxnid(long trxnid) {
		this.trxnid = trxnid;
	}

	public double getTrxnamount() {
		return trxnamount;
	}

	public void setTrxnamount(double trxnamount) {
		this.trxnamount = trxnamount;
	}

	public Date getTrxndate() {
		return trxndate;
	}

	public void setTrxndate(Date trxndate) {
		this.trxndate = trxndate;
	}
	
	
	
	

}
