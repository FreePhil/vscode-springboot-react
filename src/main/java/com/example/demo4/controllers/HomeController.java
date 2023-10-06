package com.example.demo4.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo4.models.Video;
import com.example.demo4.services.VideoService;

@Controller
public class HomeController {

    private final VideoService videoService;

    public HomeController(VideoService videoService) {
        this.videoService = videoService;
    }

    List<Video> videos = List.of(
        new Video("Need Help with your spring boot 3 app?"),
        new Video("Don't do This to your own cod!"),
        new Video("secrets to fix broken code!")
        );
    
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("videos", videoService.getVideos());
        return "index";
    }

    @PostMapping("/new_video")
    public String newVideo(@ModelAttribute Video newVideo) {
        videoService.create(newVideo);
        return "redirect:/";
    }

    @GetMapping("/react")
    public String react() {
        return "react";
    }
}