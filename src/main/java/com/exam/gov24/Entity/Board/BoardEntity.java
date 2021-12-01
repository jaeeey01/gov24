package com.exam.gov24.Entity.Board;

import com.exam.gov24.Entity.BaseEntity.DateEntity;
import com.exam.gov24.Entity.User.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BoardEntity extends DateEntity {

    @Id
    @SequenceGenerator(name="board_seq")
    private Long boNo;

    @Column(nullable = false)
    private String title;

    @Column(length=1000, nullable = false)
    private String content;

    @ColumnDefault(value="1")
    private int deleteCheck;



}
