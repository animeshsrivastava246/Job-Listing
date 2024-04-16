package com.alfred.joblisting.repository;

import java.util.List;

import com.alfred.joblisting.model.Post;

public interface SearchRepository {
    List<Post> findByText(String text);
}
