package com.himedia;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

//properties : 테스트가 실행되기 전에 테스트에 사용할 프로퍼티들을 "key=value"형태로 추가하거나 properties파일에 설정된 프로퍼티를 재정의 함
//classes : 테스트할 클래스들을 등록, 만일  classes속성을 생략하면 애플리케이션에 정의된 모든 빈을 생성 
//webEnvironment : 애플리케이션이 실행될 대 관련되 환경을 설정할 수 있다
@SpringBootTest()  //메인 클레스에 선언된 @SpringBootApplication 과 비슷한 어노테이션이라고 생각하면 됨 , @SpringBootApplication이 사용자가 작성한 빈과 자동설정 빈들을 모두 초기화 하듯이 @SpringBootTest역시 테스트케이스가 실행될 때 테스트에 필요한 모든 설정과 빈들을 자동으로 초기화하는 역할 수행
class Chapter03ApplicationTests {

	@Test
	void contextLoads() {
	}

}
