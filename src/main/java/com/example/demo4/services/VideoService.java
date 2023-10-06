package com.example.demo4.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo4.models.Video;

@Service
public class VideoService {

    private List<Video> videos = List.of(
            new Video("Need Help with your spring boot 3 app?"),
            new Video("Don't do This to your own cod!"),
            new Video("secrets to fix broken code!")
        );

    public List<Video> getVideos() {
        return videos;
    }

    public Video create(Video newVideo) {
        List<Video> extend = new ArrayList<>(videos);
        extend.add(newVideo);
        this.videos = List.copyOf(extend);
        return newVideo;
    }
}
