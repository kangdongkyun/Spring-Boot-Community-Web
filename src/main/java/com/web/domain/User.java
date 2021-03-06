package com.web.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
@Table
public class User {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;
    @Column
    private String name;
    @Column
    private String password;
    @Column
    private String email;
    @Column
    private LocalDateTime createDate;
    @Column
    private LocalDateTime updatedDate;

    public User(Long idx, String name, String password, String email,
                LocalDateTime createDate, LocalDateTime updatedDate) {
        this.idx = idx;
        this.name = name;
        this.password = password;
        this.email = email;
        this.createDate = createDate;
        this.updatedDate = updatedDate;
    }
}
