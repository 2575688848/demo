package com.example.demo.es;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.validation.constraints.NotNull;

@Document(indexName = "ytp", type = "userInfo")
@Data
public class UserInfo {

    @Id
    @NotNull
    private String id;

    @NotNull
    private String userName;

    @NotNull
    private String email;
}
