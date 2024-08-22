package com.gabrielfigueiredo.springcourse.services;

import com.gabrielfigueiredo.springcourse.entities.User;
import com.gabrielfigueiredo.springcourse.repositories.UserRepository;
import com.gabrielfigueiredo.springcourse.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
       Optional<User> user = userRepository.findById(id);
       return user.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User user) {
        return userRepository.save(user);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    public User update(Long id, User updatedUser) {
        User entity = userRepository.getReferenceById(id);
        updateDate(entity, updatedUser);
        return userRepository.save(entity);
    }

    private void updateDate(User entity, User updatedUser) {
        entity.setName(updatedUser.getName());
        entity.setEmail(updatedUser.getEmail());
        entity.setPhone(updatedUser.getPhone());
    }
}
