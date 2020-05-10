package com.emart.user.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "t_seller")
@EntityListeners(AuditingEntityListener.class)
@Data
@NoArgsConstructor
public class Seller implements Serializable {


    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "company_name")
    private String company_name;
    
    @Column(name = "gstin")
    private String gstin;

    @Column(name = "about_company")
    private String about_company;

    @Column(name = "postal")
    private String postal;
    
    @Column(name = "website")
    private String website;
    
    @Column(name = "email")
    private String email;

    @Column(name = "mobile")
    private String mobile;

    @CreatedDate
    @Column(name = "creat_date")
    @JsonFormat(pattern="yyyy-MM-dd")
    private String creat_date;

    
}