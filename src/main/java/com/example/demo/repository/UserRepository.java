package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    @Query(value = "select * from concat s where s.company_code = ?1", nativeQuery = true)
    List<User> findByCompanyCodeUsingNativeQuery(String company_code);
    @Query(value = "select * from concat sr where sr.conid = ?1", nativeQuery = true)
    List<User> findAllValuesByNQUsingId(String conid);
}



//"select company_code,first_name,last_name,user_name,created_date,email_id,created_by,updated_by,updated_date from concat sr where sr.conid = ?1",