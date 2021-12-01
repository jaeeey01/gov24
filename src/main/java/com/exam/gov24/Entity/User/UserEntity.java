package com.exam.gov24.Entity.User;

import com.exam.gov24.Entity.BaseEntity.DateEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity extends DateEntity {

    @Id
    @SequenceGenerator(name="user_seq")
    private String id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false, length = 1000)
    private String address;

    @Column(nullable =false)
    private int auth;



}
