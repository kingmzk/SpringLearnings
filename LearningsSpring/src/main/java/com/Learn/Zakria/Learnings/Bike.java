package com.Learn.Zakria.Learnings;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle
{

	public void drive()
	{
		System.out.println("I am Riding a Bike");
	}
}
