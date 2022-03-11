package com.student.service.implementation;

import com.student.model.Admin;
import com.student.model.User;
import com.student.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdminServiceImp extends UserServiceImp{
    @Autowired
    private AdminRepository adminRepository;

    public void saveAdmin(User admin){
        adminRepository.save((Admin) admin);
    }

    public List<Admin> getAllAdmins(){
        return adminRepository.findAll();
    }

    public Admin getAdnin(Long id){
        return adminRepository.findById(id).get();
    }

    public void dekletAdmin(Long id){
        adminRepository.deleteById(id);
    }

    public Admin login(String email, String password){
        return adminRepository.login(email, password);
    }
}
