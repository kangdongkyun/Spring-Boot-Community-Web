package com.web.domain;

import com.web.domain.enums.BoardType;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
@Table
public class Board implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;
    @Column
    private String title;
    @Column
    private String subTitle;
    @Column
    private String content;
    @Column
    @Enumerated(EnumType.STRING)
    private BoardType boardType;
    @Column
    private LocalDateTime createDate;
    @Column
    private LocalDateTime updatedDate;
    @OneToOne(fetch=FetchType.LAZY)
    private User user;

    public Board(Long idx, String title, String subTitle, String content, BoardType boardType,
                 LocalDateTime createDate, LocalDateTime updatedDate, User user) {
        this.idx = idx;
        this.title = title;
        this.subTitle = subTitle;
        this.content = content;
        this.boardType = boardType;
        this.createDate = createDate;
        this.updatedDate = updatedDate;
        this.user = user;
    }
}
