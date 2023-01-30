package com.iamcheslin.portfolio.projects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/projects")
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    @GetMapping("/")
    public ResponseEntity<List<Project>> getProjects(){
        return new ResponseEntity<List<Project>>(projectService.getProjects(),HttpStatus.OK);
    }
}
