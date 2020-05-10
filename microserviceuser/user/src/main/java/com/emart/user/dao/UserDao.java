package com.emart.user.dao;

import com.emart.user.entity.User;
import com.emart.user.entity.Buyer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao  extends JpaRepository<User, Long> {
    
  @Query(value="select count(1) from t_buyer as t where t.mail = ?1 and t.password = ?2",nativeQuery=true)
  public int findBuyer(String mail,String password);
        
  @Query(value="select count(1) from t_seller as t where t.mail = ?1 and t.password = ?2",nativeQuery=true)
  public int findSeller(String mail,String password);
    
}