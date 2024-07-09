package com.APP.Lista.de.Tutoriales;

import com.APP.Lista.de.Tutoriales.Controllers.TutorialController;
import com.APP.Lista.de.Tutoriales.Models.Tutorial;
import com.APP.Lista.de.Tutoriales.Services.TutorialServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class TutorialControllerTest {

    @Mock
    private TutorialServices tutorialServices;

    @InjectMocks
    private TutorialController tutorialController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCreateTutorialDescription() {
        // Arrange
        Tutorial newTutorial = new Tutorial();
        newTutorial.setDescription("Here goes a detailed description of tutorial");

        when(tutorialServices.createTutorial(any(Tutorial.class))).thenReturn(newTutorial);

        // Act
        Tutorial result = tutorialController.createTutorial(newTutorial);

        // Assert
        assertNotNull(result);
        assertEquals("Here goes a detailed description of tutorial", result.getDescription());
        verify(tutorialServices).createTutorial(any(Tutorial.class));
    }
    @Test
    public void test_if_createTutorial_creates_title() {
        //Arrange
        Tutorial newTutorial = new Tutorial();
        newTutorial.setTitle("New Tutorial");

        when(tutorialServices.createTutorial(any(Tutorial.class))).thenReturn(newTutorial);

        //Act
        Tutorial result = tutorialController.createTutorial(newTutorial);

        //Assert
        assertNotNull(result);
        assertEquals("New Tutorial", result.getTitle());
        verify(tutorialServices).createTutorial(newTutorial);
    }
    @Test
    public void test_if_GetAllTutorials_gets_title() {
        //Arrange
        ArrayList<Tutorial> listOfTutorials = new ArrayList<>();

        Tutorial newTutorial1 = new Tutorial( "buy bread", "go to baker street");
        Tutorial newTutorial2 = new Tutorial( "go to gym", "practice a bit of soccer");
        Tutorial newTutorial3 = new Tutorial( "play guitar", "do agility exercises");
        listOfTutorials.add(newTutorial1);
        listOfTutorials.add(newTutorial2);
        listOfTutorials.add(newTutorial3);
        when(tutorialServices.getAllTutorials()).thenReturn(listOfTutorials);


        //Act
        ArrayList<Tutorial> result = tutorialController.getAllTutorials();
        //Assert
        assertNotNull(result);
        assertEquals(3, result.size());
        assertEquals("buy bread", result.get(0).getTitle());
        assertEquals("go to gym", result.get(1).getTitle());
        assertEquals("play guitar", result.get(2).getTitle());

        verify(tutorialServices).getAllTutorials();
    }
    @Test
    public void test_if_GetAllTutorials_gets_description() {
        //Arrange
        ArrayList<Tutorial> listOfTutorials = new ArrayList<>();

        Tutorial newTutorial1 = new Tutorial( "buy bread", "go to baker street");
        Tutorial newTutorial2 = new Tutorial( "go to gym", "practice a bit of soccer");
        Tutorial newTutorial3 = new Tutorial( "play guitar", "do agility exercises");
        listOfTutorials.add(newTutorial1);
        listOfTutorials.add(newTutorial2);
        listOfTutorials.add(newTutorial3);
        when(tutorialServices.getAllTutorials()).thenReturn(listOfTutorials);


        //Act
        ArrayList<Tutorial> result = tutorialController.getAllTutorials();
        //Assert
        assertNotNull(result);
        assertEquals(3, result.size());

        assertEquals("go to baker street", result.get(0).getDescription());
        assertEquals("practice a bit of soccer", result.get(1).getDescription());
        assertEquals("do agility exercises", result.get(2).getDescription());
        verify(tutorialServices).getAllTutorials();
    }
    @Test
    public void test_if_deleteAllTutorials_deletes_all() {
        //Arrange
        ArrayList<Tutorial> listOfTutorials = new ArrayList<>();

        Tutorial newTutorial1 = new Tutorial( "buy bread", "go to baker street");
        Tutorial newTutorial2 = new Tutorial( "go to gym", "practice a bit of soccer");
        Tutorial newTutorial3 = new Tutorial( "play guitar", "do agility exercises");
        listOfTutorials.add(newTutorial1);
        listOfTutorials.add(newTutorial2);
        listOfTutorials.add(newTutorial3);
        when(tutorialServices.getAllTutorials()).thenReturn(listOfTutorials);

        //Act
        tutorialController.deleteAllTutorials();

        verify(tutorialServices).deleteAllTutorials(listOfTutorials);
    }
    @Test
    public void test_if_deleteTutorialById_deletes_by_Id() {
        //Arrange
        ArrayList<Tutorial> listOfTutorials = new ArrayList<>();

        Tutorial newTutorial1 = new Tutorial( "buy bread", "go to baker street");
        Tutorial newTutorial2 = new Tutorial( "go to gym", "practice a bit of soccer");
        Tutorial newTutorial3 = new Tutorial( "play guitar", "do agility exercises");
        listOfTutorials.add(newTutorial1);
        listOfTutorials.add(newTutorial2);
        listOfTutorials.add(newTutorial3);
        when(tutorialServices.getAllTutorials()).thenReturn(listOfTutorials);

        //Act
        tutorialController.deleteTutorialById(2);

        //Assert
        verify(tutorialServices).deleteTutorialById(2);
    }
}
