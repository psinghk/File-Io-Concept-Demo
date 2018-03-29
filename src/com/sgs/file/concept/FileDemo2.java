package com.sgs.file.concept;

import java.io.File;

public class FileDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		 File f = new File("Prabhat004");
		 System.out.println(f.exists());
		 f.mkdirs();
		 System.out.println(f.exists());
		 System.out.println("Thsi my github code on psinghk");
		 System.out.println("And we try to conflict ");
				 
	}

}
