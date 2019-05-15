package com.example.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.entity.AcctInfo;
import com.example.jpa.repository.AcctInfoRepository;
import com.example.jpa.repository.RptDtlRepository;

@RestController
public class RptDtlController {

    @Autowired
    private RptDtlRepository rptDtlRepository;
    
    @Autowired
    private AcctInfoRepository acctIndoRepository;
    
    

    @GetMapping("/report")
    public List<AcctInfo> getAllPosts() {
        return acctIndoRepository.findAll();
    }
    
  /*  @GetMapping("/acctInfo")
    public List<AcctInfo> getAcctInfo() {
        return acctIndoRepository.findAll();
    }
  */  
    
/*
    @PostMapping("/posts")
    public Post createPost(@Valid @RequestBody Post post) {
        return postRepository.save(post);
    }

    @PutMapping("/posts/{postId}")
    public Post updatePost(@PathVariable Long postId, @Valid @RequestBody Post postRequest) {
        return postRepository.findById(postId).map(post -> {
            post.setTitle(postRequest.getTitle());
            post.setDescription(postRequest.getDescription());
            post.setContent(postRequest.getContent());
            return postRepository.save(post);
        }).orElseThrow(() -> new ResourceNotFoundException("PostId " + postId + " not found"));
    }


    @DeleteMapping("/posts/{postId}")
    public ResponseEntity<?> deletePost(@PathVariable Long postId) {
        return postRepository.findById(postId).map(post -> {
            postRepository.delete(post);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("PostId " + postId + " not found"));
    }
*/
}
