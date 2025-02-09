package com.example.rest_api.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class) //해당 클래스들을 snake_case로 매핑하겠다.
public class User {
    private String userName;
    private Integer userAge;
    private String userEmail;
    private Boolean isKorean;

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", userEmail='" + userEmail + '\'' +
                ", isKorean=" + isKorean +
                '}';
    }
}
