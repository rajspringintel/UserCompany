package com.example.demo.model;


import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="concat")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  String staid;
//private  String conid;
    private String  user_name;
    //@Column(name="email_id")
    private String email_id;
    //@Column(name="first_name")
    private String first_name;
    //@Column(name="last_name")
    private String  last_name;
    // @Column(name="password")
    private String password;
    //@Column(name = "company_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int co_id;
    private String CompanySuffix;
//    private String companyCode;
    //@Column(name = "created_by")
    private String createdBy;
    //@Column(name = "created_date")
    private Date createdDate;
    //@Column(name = "updated_by")
    private String updatedBy;
    //@Column(name = "updated_date")
    private Date updatedDate;

    public User()
    {
    }

    public User(int id, String staid, String user_name, String email_id, String first_name, String last_name, String password, int co_id, String companySuffix, String createdBy, Date createdDate, String updatedBy, Date updatedDate) {
        this.id = id;
        this.staid = staid;
        this.user_name = user_name;
        this.email_id = email_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.password = password;
        this.co_id = co_id;
        CompanySuffix = companySuffix;
       this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
    }

    //  public void setConid(String conid) {
       // this.conid = conid;
   // }

//    public String getConid() {
//        return conid;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStaid() {
        return staid;
    }

    public void setStaid(String staid) {
        this.staid = staid;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public String getCompanyCode() {
//        return companyCode;
//    }
//
//    public void setCompanyCode(String companyCode) {
//        this.companyCode = companyCode;
//    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public int getCo_id() {
        return co_id;
    }

    public void setCo_id(int co_id) {
        this.co_id = co_id;
    }

    public String getCompanySuffix() {
        return CompanySuffix;
    }

    public void setCompanySuffix(String companySuffix) {
        CompanySuffix = companySuffix;
    }
}
