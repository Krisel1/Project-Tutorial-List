package com.APP.Lista.de.Tutoriales.Services;


import com.APP.Lista.de.Tutoriales.Modules.Tutorial;
import com.APP.Lista.de.Tutoriales.Repositories.ITutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TutorialServices {

    @Autowired
    ITutorialRepository iTutorialRepository;

    public ArrayList<Tutorial> getAllTutorials(){
        return (ArrayList<Tutorial>) iTutorialRepository.findAll();
    }
    public Tutorial createTutorial (Tutorial newTutorial){
        return iTutorialRepository.save(newTutorial);
    }
    public void deleteTutorial(Tutorial newTutorial){
        iTutorialRepository.delete(newTutorial);
    }
    public void deleteAllTutorials(ArrayList<Tutorial> tutorials){
        iTutorialRepository.deleteAll(tutorials);
    }


}
