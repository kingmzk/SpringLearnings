package com.Learn.Zakria.Learnings;

import org.springframework.stereotype.Component;

@Component
public class Tyre
{
	private String Brand;
	
	
	public String getBrand()
	{
		return Brand;
	}
	
	public void setBrand(String Brand)
	{
		this.Brand = Brand;
	}

//	public Tyre(String brand) {
//		super();
//		Brand = brand;
//	}

	@Override
	public String toString() {
//		return "Tyre [Brand=" + Brand + "]";
		return "Tyre is working";
	}

}
