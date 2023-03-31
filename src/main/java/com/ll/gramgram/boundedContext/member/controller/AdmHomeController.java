package com.ll.gramgram.boundedContext.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/adm")
public class AdmHomeController { //관리자 페이지
    @GetMapping("")
    @PreAuthorize("hasAuthority('admin')")
    public String showMain(){
        return "adm/home/main";
    }
}
