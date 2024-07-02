package com.APP.Lista.de.Tutoriales.Controllers;


import com.APP.Lista.de.Tutoriales.Models.Tutorial;
import com.APP.Lista.de.Tutoriales.Services.TutorialServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class TutorialController {

    @Autowired
    TutorialServices tutorialServices;

    @GetMapping(path = "/tutorials")
    public ArrayList<Tutorial> getAllTutorials() {
        return tutorialServices.getAllTutorials();
    }

    @GetMapping(path = "/tutorial/{id}")
    public Optional<Tutorial> getTutorialById(@PathVariable("id")int id){
        return tutorialServices.getTutorialById(id);
    }

    @PostMapping(path = "/tutorials")
    public Tutorial createTutorial(@RequestBody Tutorial newTutorial) {
        return tutorialServices.createTutorial();
    }

    @PutMapping(path = "/tutorials")
    public Tutorial updateTutorial(@RequestBody Tutorial tutorial) {
        return tutorialServices.updateTutorial();
    }

    @DeleteMapping(path = "/tutorials")
    public void deleteTutorial(@RequestBody Tutorial newTutorial) {
        return tutorialServices.deleteTutorial();
    }
}