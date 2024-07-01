package com.APP.Lista.de.Tutoriales.Controllers;


import com.APP.Lista.de.Tutoriales.Modules.Tutorial;
import com.APP.Lista.de.Tutoriales.Services.TutorialServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
    @DeleteMapping("/delete")
    public void deleteTutorial(@RequestBody Tutorial newTutorial){
        tutorialServices.deleteTutorial(newTutorial);
    }
    @DeleteMapping("/deleteById/{id}")
    public void deleteTutorialById(@PathVariable("id")int id){
        tutorialServices.deleteTutorialById(id);
    }
    @DeleteMapping("/deleteAll")
    public void deleteAllTutorials(@RequestBody List<Tutorial> tutorials){
        tutorialServices.deleteAllTutorials(tutorials);
    }
}
