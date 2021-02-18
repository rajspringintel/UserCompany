package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;
//@Autowired
//Concat c;

//    @PostMapping("/saveRole/{id}/{staid}")
////private Long saveRole(@RequestBody Role role)
//    private void saveRole(@PathVariable int id, @PathVariable String staid) {
//        List<Concat> c = new ArrayList<Concat>();
//        Concat c1 = new Concat(id, staid);
//        c.add(c1);
////c.setStaid(staid);
////String userid=staid+id;
////c.setConid(userid);
//        Iterator itr = c.iterator();//getting the Iterator
//        while (itr.hasNext()) {//check if iterator has the elements
//            System.out.println(itr.next());//printing the element and move to next
//        }
//        // return role.getId() ;
//repos.save(c1);
//    }
//    @PostMapping("/saveRole")
//    private Concat saveRole(@RequestBody Concat concat)
//    {
//        return  repos.save(concat);
//    }
@GetMapping(value = "/companyByNative/{company_code}")
private List<User> getCompanyByCode(@PathVariable(value = "company_code") String company_code)
{
    return userService.findByCompanyCode(company_code);
}
    @GetMapping(value = "/companyByNativeUsingID/{conid}")
    private List<User> getCompanyByID(@PathVariable(value = "conid") String conid)
    {
        return userService.findByIdUsingNative(conid);
    }
    @PostMapping("/saveRole")
    //private Long saveRole(@RequestBody Role role)
    private ResponseEntity<Object> saveRole(@RequestBody User user)
    {
        return userService.saveOrUpdate(user);
        // return role.getId() ;
    }
}