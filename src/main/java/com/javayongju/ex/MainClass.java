package com.javayongju.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(); //컨테이너 생성


		ctx.load("classpath:applicationCTX.xml"); //컨테이너 설정

		ctx.refresh(); //컨테이너 설정


		Student student = ctx.getBean("student", Student.class); //컨테이너 사용
		System.out.println(student.getName()); //이름
		System.out.println(student.getAge());//나이

		OtherStudent otherstudent = ctx.getBean("otherstudent", OtherStudent.class);
		System.out.println(otherstudent.getName());
		System.out.println(otherstudent.getAge());
		
		ctx.close(); //컨테이너 종료
	}

}
