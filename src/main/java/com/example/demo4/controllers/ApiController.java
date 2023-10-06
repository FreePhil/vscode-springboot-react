package com.example.demo4.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo4.models.Video;
import com.example.demo4.services.VideoService;

@RestController
public class ApiController {
    private final VideoService videoService;
    
    public ApiController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping("/api/videos")
    public List<Video> all() {
        return videoService.getVideos();
    }
}
