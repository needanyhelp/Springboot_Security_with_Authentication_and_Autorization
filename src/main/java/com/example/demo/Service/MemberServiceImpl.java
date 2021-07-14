package com.example.demo.Service;

import com.example.demo.Dto.MemberTo;
import com.example.demo.Entity.Member;
import com.example.demo.Dto.MemberDao;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberDao memberDao;

    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        Optional<Member> memberWrapper = memberDao.findById(id);
        Member member = memberWrapper.orElse(null);

        System.out.println(member.toString());

        List<GrantedAuthority> authorities = new ArrayList<>();

        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));

        return new User(member.getId(), member.getPw(), authorities);

    }

    @Transactional
    @Override
    public String save(MemberTo memberTo){
        Member member = memberTo.toEntity();

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        member.setPw(passwordEncoder.encode(member.getPw()));
        return memberDao.save(member).getId();
    }
}
