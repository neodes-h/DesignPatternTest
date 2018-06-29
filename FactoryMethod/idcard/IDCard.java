package idcard;

import framework.Product;

public class IDCard extends Product {
	
	private String owner;
	
	public IDCard(String owner) {
		this.owner = owner; 
		System.out.println("Made " + owner + "'s card");
	}
	
	@Override
	public void use() {
		System.out.println("Used " + owner +"'s card");

	}
	
	public String getOwner() {
		return owner;
	}

}
