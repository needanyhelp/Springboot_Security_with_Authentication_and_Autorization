package com.example.demo.Dto;


import com.example.demo.Entity.Member;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
public class MemberTo {

    private String id;

    private String pw;

    private String first_name;

    private String last_name;

    private String email;

    public Member toEntity() {
        return new Member(id,pw,first_name,last_name, email);
    }


}

