package com.myblog2.myblog2.service.impl;

import com.myblog2.myblog2.entity.Post;
import com.myblog2.myblog2.payload.PostDto;
import com.myblog2.myblog2.repository.PostRepository;
import com.myblog2.myblog2.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImp implements PostService {
    private PostRepository postRepo;

    public PostServiceImp(PostRepository postRepo) {
        this.postRepo = postRepo;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        Post post=new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        Post savedPost = postRepo.save(post);

        PostDto dto=new PostDto();
        dto.setTitle(savedPost.getTitle());
        dto.setDescription(savedPost.getDescription());
        dto.setContent(savedPost.getContent());
        return dto;
    }
}
