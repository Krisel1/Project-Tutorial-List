package com.APP.Lista.de.Tutoriales;

import com.APP.Lista.de.Tutoriales.Models.Tutorial;
import com.APP.Lista.de.Tutoriales.Repositories.ITutorialRepository;
import com.APP.Lista.de.Tutoriales.Services.TutorialServices;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class AppListaDeTutorialesApplicationTests {

    @Mock
    private ITutorialRepository iTutorialRepository;

    @InjectMocks
    //inyeccion de dependencias. Inyecta los mocks en el objeto de prueba.
    private TutorialServices tutorialServices;

    /*El método MockitoAnnotations.openMocks(this) se utiliza para inicializar los mocks que han sido anotados con @Mock y @InjectMocks. En otras palabras, se encarga de preparar los objetos simulados (mocks) que se utilizarán en las pruebas.*/
    @BeforeEach
    // indica que el metodo se deje ejecutar antes de cada metodo
    public void setUp() {
        MockitoAnnotations.openMocks(this);



    }


    @Test
    void getAllTutorials(){
        ArrayList<Tutorial> listOfTutorials = new ArrayList<>();

        Tutorial newTutorial1 = new Tutorial(1, "buy bread", "go to baker street");
        Tutorial newTutorial2 = new Tutorial(2, "go to gym", "practice a bit of soccer");
        Tutorial newTutorial3 = new Tutorial(3, "play guitar", "do agility exercises");
        listOfTutorials.add(newTutorial1);
        listOfTutorials.add(newTutorial2);
        listOfTutorials.add(newTutorial3);
        when(iTutorialRepository.findAll()).thenReturn(listOfTutorials);


        //Act
        ArrayList<Tutorial> result = tutorialServices.getAllTutorials();
        //Assert
        assertNotNull(result);
        assertEquals(3, result.size());
        assertEquals("buy bread", result.get(0).getTitle());
        assertEquals("go to gym", result.get(1).getTitle());
        assertEquals("play guitar", result.get(2).getTitle());

        verify(iTutorialRepository).findAll();
    }
}