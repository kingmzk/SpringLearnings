package com.Learn.Zakria.SpringAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class MediaTek implements MobileProcessor
{
   public void process()
   {
	   System.out.println("Secon Best Cpu");
   }
}
