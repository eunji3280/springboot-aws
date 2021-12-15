package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

//DB Layer접근자.
public interface PostsRepository extends JpaRepository<Posts, Long> {

}
