package com.assignmentjava.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    @Autowired
    HttpServletRequest req;
    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }

    @GetMapping("/logoff/success")
    public String logout(){
        System.out.println("success");
        return "redirect:/login";
    }
    @GetMapping("/login/fail")
    public String logìnail(){
        System.out.println("fail");
        return "redirect:/login";
    }
    @GetMapping("/403")
    @ResponseBody
    public String urlNotAccess(){
        return "<h1>Tài khoản không có quyền truy cập</h1>";
    }
}
