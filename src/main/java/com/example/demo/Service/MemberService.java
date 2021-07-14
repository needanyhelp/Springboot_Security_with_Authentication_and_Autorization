package com.example.demo.Service;

import com.example.demo.Dto.MemberTo;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface MemberService extends UserDetailsService {

    String save(MemberTo memberTo);
}
