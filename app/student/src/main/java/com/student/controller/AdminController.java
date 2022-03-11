package com.student.controller;

import com.student.model.Admin;
import com.student.service.implementation.AdminServiceImp;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
public class AdminController {
    @Autowired
    private AdminServiceImp adminServiceImp;

    @GetMapping("/login")
    public String loginPage(ModelMap modelMap){
        modelMap.put("admin", new Admin());
        return "login";
    }
    @PostMapping("login")
    public String login(@ModelAttribute("admin") Admin admin, HttpSession session, ModelMap modelMap){
        Admin fAdmin = adminServiceImp.login(admin.getEmail(), admin.getPassword());
        if(fAdmin == null) {
            modelMap.put("error", "login fail");
            return "redirect:/login";
        }else {
            session.setAttribute("admin", admin);
            return "redirect:/school/";
        }
    }


    @GetMapping("/logout")
    public String logout(HttpSession httpSession) {
        httpSession.invalidate();
        return "redirect:/login";
    }

//    @PostMapping("/login")
//    public ModelAndView login(Admin admin, HttpSession httpSession){
//        ModelAndView mv = new ModelAndView();
//        Admin foundadmin = adminServiceImp.getAdnin(2l);
//        return
//    }
}
