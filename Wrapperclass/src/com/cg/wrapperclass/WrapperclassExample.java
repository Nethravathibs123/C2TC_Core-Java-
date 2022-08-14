package com.cg.wrapperclass;

public class WrapperclassExample {

	public static void main(String[] args) {
		Integer a=new Integer(3);
		int i=a.intValue();
		int j=a;//unboxing 
		System.out.println(j);
	
       /* int a=20;
        Integer i=Integer.valueOf(a);//converting int into integer explicitly
        Integer j=a;//autoboxing
        System.out.println(a+" "+i+" "+j);	*/
	}

}
