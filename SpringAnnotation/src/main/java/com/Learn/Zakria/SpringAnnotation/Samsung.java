package com.Learn.Zakria.SpringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("samsung")
public class Samsung
{
	@Autowired
	//@Qualifier("mediaTek")  //this one or use primary
	@Qualifier("snapdragon")
	MobileProcessor cpu;
  public MobileProcessor getCpu() {
		return cpu;
	}
	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}
public void config()
  {
	  System.out.println("This is octa-Core, 12mp camera ,Midrange Phone");
	  cpu.process();
  }
}
