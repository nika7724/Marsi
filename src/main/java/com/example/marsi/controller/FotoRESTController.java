package com.example.marsi.controller;

import com.example.marsi.model.Photo;
import com.example.marsi.service.ApiServicePhotos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FotoRESTController {
    @Autowired
    ApiServicePhotos apiServicePhotos;

    @GetMapping("/photos")
    List<Photo> getPhotos() {
        return apiServicePhotos.getPhotos();
    }
}
