package com.student.service.implementation;

import com.student.model.Teacher;
import com.student.model.User;
import com.student.repository.TeacherRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@AllArgsConstructor
@Service
@Transactional
public class TeacherServiceImp extends User {
    @Autowired
    private TeacherRepository teacherRepository;


//    public List<Teacher> getAllTeacher() {
//        return (List<Teacher>) teacherRepository.findAll();
//    }
//
//    public Teacher get(Long id){
//        return teacherRepository.findById(id).get();
//    }
//
//    public void delete(Long id){
//        teacherRepository.deleteById(id);
//    }
//
//    public void saveTeacher(Teacher teacher) {
//        teacherRepository.save(teacher);
//    }

    public void saveTeacher(User teacher){
        teacherRepository.save((Teacher) teacher);
    }

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    public Teacher getTeacher(Long id){
        return teacherRepository.findById(id).get();
    }

    public void deleteTeacher(Long id){
        teacherRepository.deleteById(id);
    }


}
