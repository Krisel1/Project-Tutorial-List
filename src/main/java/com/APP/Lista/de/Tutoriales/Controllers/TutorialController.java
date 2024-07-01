package com.APP.Lista.de.Tutoriales.Controllers;


import com.APP.Lista.de.Tutoriales.Models.Tutorial;
import com.APP.Lista.de.Tutoriales.Services.TutorialServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

//localhost:8080/tutorial

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class TutorialController {

    @Autowired
    TutorialServices tutorialServices;

    @GetMapping(path = "/tutorial")
    public ArrayList<Tutorial> getAllTutorial() {
        return tutorialServices.getAllTutorial();
    }


}