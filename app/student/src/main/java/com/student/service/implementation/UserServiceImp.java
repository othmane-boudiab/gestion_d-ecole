package com.student.service.implementation;

import com.student.model.User;
import com.student.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImp {
    @Autowired
    private UserRepository userRepository;

    public void savaUser(User user){
        userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUser(Long id){
        return userRepository.findById(id).get();
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
