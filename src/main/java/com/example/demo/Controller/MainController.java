package com.example.demo.Controller;

import com.example.demo.Dto.MemberTo;
import com.example.demo.Service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final MemberService service;

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/signup")
    public String signup(Model model){
        MemberTo memberTo = new MemberTo();
        model.addAttribute("memberTo", memberTo);
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(@ModelAttribute MemberTo memberTo){
        service.save(memberTo);

        return "redirect:/login";
    }
    @GetMapping("/Welcome")
    public String welcome(){
        return "welcome";
    }

}
