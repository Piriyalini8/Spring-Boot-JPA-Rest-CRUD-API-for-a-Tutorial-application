package com.example.tutorial.service;

import com.example.tutorial.model.Tutorial;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ITutorialService {
    ResponseEntity<List<Tutorial>> getAllTutorials(String title);
    ResponseEntity<Tutorial> getTutorialById(long id);
    ResponseEntity<Tutorial> createTutorial(Tutorial tutorial);
    ResponseEntity<Tutorial> updateTutorial(long id, Tutorial tutorial);
    ResponseEntity<HttpStatus> deleteTutorial(long id);
    ResponseEntity<HttpStatus> deleteAllTutorials();
    ResponseEntity<List<Tutorial>> findByPublished();
}
