package com.student.controller;

import com.student.model.Admin;
import com.student.model.Teacher;
import com.student.model.User;
import com.student.service.implementation.TeacherServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/school")
public class StudentController {

    @Autowired
   private TeacherServiceImp teacherServiceImp;

//    @RequestMapping("/new")
//    public String addStudent(Map<String, Object> model) {
//        User student = new Student();
//        model.put("student", student);
//        return "add";
//    }
//
//    @RequestMapping(value = "/save", method = RequestMethod.POST)
//    public String saveStudent(@ModelAttribute("student") Student student) {
//        studentService.save(student);
//        return "redirect:/home";
//    }

@RequestMapping("/")
    public ModelAndView home(){
        List<Teacher> teacherList = teacherServiceImp.getAllTeachers();
        ModelAndView mav = new ModelAndView("home");
        mav.addObject("teacherlist", teacherList);
        return mav;
    }

    @GetMapping("/new")
    public String showFormForAdd(Model theModel) {
        Teacher teacher = new Teacher();
        theModel.addAttribute("teacher", teacher);
        return "add";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("teacher") Teacher teacher) {
       teacherServiceImp.saveTeacher(teacher);
        return "redirect:/school/";
    }

    @RequestMapping("/edit")
    public ModelAndView editTeacher(@RequestParam Long id){
        ModelAndView mav = new ModelAndView("edit-teacher");
        Teacher teacher = teacherServiceImp.getTeacher(id);
        mav.addObject("teacher", teacher);
        return mav;
    }

    @RequestMapping("/delete")
    public String deleteTeacher(@RequestParam Long id){
    teacherServiceImp.deleteTeacher(id);
    return "redirect:/school/";
    }

//    @ModelAttribute
//    public void sessionAttributes(Model model, HttpSession httpSession){
//        if(!httpSession.isNew()) {
//            Admin currentUser = (Admin) httpSession.getAttribute("admin");
//            model.addAttribute("firstName", currentUser.getFirstName());
//            model.addAttribute("lastName", currentUser.getLastName());
//        }
//    }
}
