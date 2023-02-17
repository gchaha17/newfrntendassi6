package com.example.assignnment4.repoistery;

import com.example.assignnment4.model.Comment;
import com.example.assignnment4.model.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CommentRepo extends MongoRepository<Comment,String> {
    List<Photo> findAllById(String photoId);
}