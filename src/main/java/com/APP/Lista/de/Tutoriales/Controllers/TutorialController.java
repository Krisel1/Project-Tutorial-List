package com.APP.Lista.de.Tutoriales.Controllers;


import com.APP.Lista.de.Tutoriales.Modules.Tutorial;
import com.APP.Lista.de.Tutoriales.Services.TutorialServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

//localhost:8080

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class TutorialController {


    @GetMapping(path = "/tutorial")
        public ArrayList<Tutorial> getAllTutorial() {

        //hacer algo para ir a la DDBB y traer los tutoriales
        return ArrayList<Tutorial>;
    }


}