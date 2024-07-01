package com.APP.Lista.de.Tutoriales.Services;


import com.APP.Lista.de.Tutoriales.Modules.Tutorial;
import com.APP.Lista.de.Tutoriales.Repositories.ITutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class TutorialServices {

    @Autowired
    ITutorialRepository iTutorialRepository;

    //create
    public Tutorial createTutorial(Tutorial newTutorial) {
        return iTutorialRepository.save(newTutorial);
    }

    //update
    public Tutorial updateTutorial(Tutorial tutorial) {
        return iTutorialRepository.save(tutorial);
    }

    //read
    public ArrayList<Tutorial> getAllTutorials() {
        return (ArrayList<Tutorial>) iTutorialRepository.findAll();
    }

    public Optional<Tutorial> getTutorialById(int id) {
        return iTutorialRepository.findById(id);
    }

    //delete
    public void deleteTutorial(Tutorial newTutorial) {
        iTutorialRepository.delete(newTutorial);
    }

    public void deleteTutorialById(int id) {
        iTutorialRepository.deleteById(id);
    }

    public void deleteAllTutorials(List<Tutorial> tutorials) {
        iTutorialRepository.deleteAll(tutorials);
    }


}
