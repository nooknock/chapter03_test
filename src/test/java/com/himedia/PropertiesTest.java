package com.himedia;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

//properties : 테스트가 실행되기 전에 테스트에 사용할 프로퍼티들을 "key=value" 형태로 추가하거나 properties 파일에 설정된 프로퍼티를 재정의 함
@SpringBootTest(properties = {"author.name=Gurum", 
	     "author.age=45", 
	     "author.nation=Korea"})
public class PropertiesTest {

	@Autowired
	Environment environment;
	
	@Test
	public void testMethod() {
		System.out.println("이름 : " + environment.getProperty("author.name"));
		System.out.println("나이 : " + environment.getProperty("author.age"));
		System.out.println("국가 : " + environment.getProperty("author.nation"));
	}
}
