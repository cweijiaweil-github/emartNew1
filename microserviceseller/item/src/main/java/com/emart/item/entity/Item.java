package com.emart.item.entity;

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
@Table(name = "t_item")
@EntityListeners(AuditingEntityListener.class)
@Data
@NoArgsConstructor
// @AllArgsConstructor
public class Item  implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "categoryId")
    private Long categoryId;

    @Column(name = "subcategoryId")
    private Long subcategoryId;

    @Column(name = "price")
    private float price;

    @Column(name = "item_name")
    private String item_name;

    @Column(name = "description")
    private String description;

    @Column(name = "stock_number")
    private Long stock_number;

    @Column(name = "remarks")
    private String remarks;

    @CreatedDate
    @Column(name = "creat_date")
    @JsonFormat(pattern="yyyy-MM-dd")
    private String creat_date;
}