package com.example.firstspring.repository;

import com.example.firstspring.entity.Comment;
import com.example.firstspring.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long>
{
    List<Comment> findAllByPost(Post post);
    Comment findByIdAndUserId(Long commentId,Long userId);
}
