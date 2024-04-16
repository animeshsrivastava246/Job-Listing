package com.alfred.joblisting.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.alfred.joblisting.model.Post;

public interface PostRepository extends MongoRepository<Post, String>{
    
}
