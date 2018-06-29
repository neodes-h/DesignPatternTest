package idcard;

import framework.Product;

public class IDCard extends Product {
	
	private String owner;
	private int number;
	
	public IDCard(String owner, int number) {
		this.owner = owner; 
		this.number = number;
		System.out.println("Made " + owner + "'s card, number is " + number);
	}
	
	@Override
	public void use() {
		System.out.println("Used " + owner +"'s card number is " + number);

	}
	
	public String getOwner() {
		return owner;
	}
	
	public int getNumber() {
		return number;
	}
}
