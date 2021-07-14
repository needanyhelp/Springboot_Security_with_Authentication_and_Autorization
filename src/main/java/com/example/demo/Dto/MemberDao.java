package com.example.demo.Dto;

import com.example.demo.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.Optional;


public interface MemberDao extends JpaRepository<Member, String> {

    Optional<Member> findById(String id);


}
