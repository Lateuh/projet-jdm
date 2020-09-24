package com.jdm.beans;

public class Relation {

	private int num;
	private int terme1;
	private int terme2;
	private int poids;
	
	
	
	public Relation(int num, int terme1, int terme2, int poids) {
		this.num = num;
		this.terme1 = terme1;
		this.terme2 = terme2;
		this.poids = poids;
	}
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getTerme1() {
		return terme1;
	}
	public void setTerme1(int terme1) {
		this.terme1 = terme1;
	}
	public int getTerme2() {
		return terme2;
	}
	public void setTerme2(int terme2) {
		this.terme2 = terme2;
	}
	public int getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}
	
	
}
