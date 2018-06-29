package idcard;

import java.util.HashMap;
import java.util.Map;

import framework.Factory;
import framework.Product;

public class IDCardFactory extends Factory {
	
	private Map<Integer, String> owners = new HashMap<>();
	

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner, owners.size());
	}

	@Override
	protected void registerProduct(Product product) {
		owners.put(((IDCard)product).getNumber(), ((IDCard)product).getOwner());
	}
	
	public Map<Integer, String> getOwners(){
		return owners;
	}
	

}
