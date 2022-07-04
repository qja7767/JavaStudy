package com.varxyz.jv200.mod004;

public class Cart {
	private Product[] products = new Product[3];
	
	public void addProduct(Product p) {
		for( int i = 0; i < products.length; i++ ) {
			if( products[i] == null  ) {
				products[i] =p;
				break;
			}
		}
	}
	
	public Product[] getProducts() {
		return products;
	}
	
	public String getDetails() {
		StringBuilder sb = new StringBuilder();
		for( Product p : products ) {
			sb.append("Name: ");
			sb.append(p.getName());
			sb.append("\nPrice: ");
			sb.append(p.getPrice());
			
			if( p instanceof SmartPhone ) {
				SmartPhone s = (SmartPhone)p;	// 캐스팅
				sb.append("\nPlatform: ");
				sb.append(s.getPlatform());
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
