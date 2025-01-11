package com.example.rest_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Lombok을 사용할 때 쓰는 어노테이션(자동으로 get set method들이 만들어짐)
@AllArgsConstructor //자동으로 오버로딩 생성자 생성.
@NoArgsConstructor //디폴트 생성자 생성.
public class BookQueryParam {
    private String category;
    private String issuedYear;
    private String issuedMonth;
    private String issuedDay;
}
