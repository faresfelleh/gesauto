package com.pfe.gesauto.service;

import com.pfe.gesauto.model.User;
import com.pfe.gesauto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public Optional<User> getUserById(long id) {return  userRepository.findById(id);}
    public Optional<User> findByName(String username) { return  userRepository.findByUsername(username);}
    public void deleteUserById(long id) {
        userRepository.deleteById(id);
    }
}
