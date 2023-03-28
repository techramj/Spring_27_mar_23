package com.easylearning.bean;

public class Engine {

	private String type;
	private int noOfStroke;
	private int hp;

	public Engine() {
		// TODO Auto-generated constructor stub
	}

	public Engine(String type, int noOfStroke, int hp) {
		super();
		this.type = type;
		this.noOfStroke = noOfStroke;
		this.hp = hp;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfStroke() {
		return noOfStroke;
	}

	public void setNoOfStroke(int noOfStroke) {
		this.noOfStroke = noOfStroke;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

}
