package com.APP.Lista.de.Tutoriales;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

import com.APP.Lista.de.Tutoriales.Controllers.TutorialController;
import com.APP.Lista.de.Tutoriales.Models.Tutorial;
import com.APP.Lista.de.Tutoriales.Services.TutorialServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(TutorialController.class)
public class TutorialControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TutorialServices tutorialServices;

    @Test
    public void testCreateTutorial() throws Exception {
        // Mock the service layer
        Tutorial newTutorial = new Tutorial();
        newTutorial.setId(1L);
        newTutorial.setTitle("Test Title");
        newTutorial.setDescription("Test Description");

        when(tutorialServices.createTutorial(any(Tutorial.class))).thenReturn(newTutorial);

        // Create a JSON representation of the Tutorial to send in the request
        String tutorialJson = "{\"title\":\"Test Title\",\"description\":\"Test Description\"}";

        // Perform the request and verify the response
        mockMvc.perform(post("/tutorials")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(tutorialJson))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").value(1L))
                .andExpect(jsonPath("$.title").value("Test Title"))
                .andExpect(jsonPath("$.description").value("Test Description"))
                .andDo(print());
    }
}
