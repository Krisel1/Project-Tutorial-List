package com.APP.Lista.de.Tutoriales.Controllers;


import com.APP.Lista.de.Tutoriales.Modules.Tutorial;
import com.APP.Lista.de.Tutoriales.Services.TutorialServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class TutorialController {


    @Autowired
    private TutorialServices tutorialServices;

    @GetMapping("/tutorials")
    public ArrayList<Tutorial> getAllTutorials() {
        return (ArrayList<Tutorial>) tutorialServices.getAllTutorials();
    }

    @PostMapping("/add")
    public Tutorial createTutorial(@RequestBody Tutorial newTutorial) {
        return tutorialServices.createTutorial(newTutorial);
    }

    @GetMapping("/saludo")
    public String sayHello() {

        return "hola desde la peticion get de tutorial project";
    }
    @PostMapping("/delete")
    public void deleteTutorial(Tutorial newTutorial){
        tutorialServices.deleteTutorial(newTutorial);
    }
    @PostMapping("/deleteById/{id}")
    public void deleteTutorialById(@PathVariable("id")int id){
        tutorialServices.deleteTutorialById(id);
    }
    @PostMapping("/deleteAll")
    public void deleteAllTutorials(ArrayList<Tutorial> tutorials){
        tutorialServices.deleteAllTutorials(tutorials);
    }
}
