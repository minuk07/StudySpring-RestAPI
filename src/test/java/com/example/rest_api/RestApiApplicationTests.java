package com.example.rest_api;

import com.example.rest_api.model.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestApiApplicationTests {

	@Autowired //스프링에서 관리하는 비들 중에 자동으로 생성되는 오브젝트 매퍼를 가져오는 어노테이션.
	private ObjectMapper objectMapper;

	@Test
	void contextLoads() throws JsonProcessingException {
		var user = new User("Hong",20,"hong@email.com",true);
		System.out.println(user);
//		user.setUserName("Hong");
//		user.setUserAge(20);
//		user.setUserEmail("hong@gmail.com");
//		user.setIsKorean(true);

		var json = objectMapper.writeValueAsString(user); //직렬화 (dto -> Json)
		System.out.println(json);

//		var dto = objectMapper.readValue(json, User.class); //역직렬화 (Json -> dto)
//		System.out.println(dto);
	}
}
