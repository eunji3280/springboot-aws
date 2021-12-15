package com.jojoldu.book.springboot.domain.posts;

import com.jojoldu.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter //롬복 어노테이션. 클래스 내 모들 필드의 getter메소드 자동생성
@NoArgsConstructor  //롬복 어노테이션.기본생성자 자동추가. public Posts(){}와 같은효과
@Entity //JPA어노테이션, 실제 테이블과 링크될 클래스임을 나타냄
public class Posts extends BaseTimeEntity {

    @Id //pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) //pk생성규칙. GenerationType.IDENTITY : auto_increment
    private Long id;

    @Column(length=500, nullable = false)   // 문자열 기본 length=255
    private String title;

    @Column(columnDefinition = "TEXT", nullable=false)
    private String content;

    private String author;

    @Builder //해당클래스의 빌더패턴클래스를 생성. 생성자 상단에 선언시 생성자에 포함된 필드만 빌더에 포함.
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }

}
