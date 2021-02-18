package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository repos;
    public ResponseEntity<Object> saveOrUpdate(User user) {
        repos.save(user);
        if (repos.findById(user.getId()).isPresent()) {
            return ResponseEntity.accepted().body("Successfully Created Role and Users");
        } else {
            return ResponseEntity.unprocessableEntity().body("Failed to Create specified Role");
        }
    }
    public List<User> findByCompanyCode(String company_code)
    {
        return repos.findByCompanyCodeUsingNativeQuery(company_code);
    }
    public List<User> findByIdUsingNative(String conid)
    {
        return repos.findAllValuesByNQUsingId(conid);
    }

}
