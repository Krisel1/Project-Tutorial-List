package com.APP.Lista.de.Tutoriales;

import com.APP.Lista.de.Tutoriales.Modules.Tutorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TutorialTest {

    @Test
    public void testId() {

        Tutorial tutorial = new Tutorial();
        Long id = 3L;
        tutorial.setId(id);
        assertEquals(id, tutorial.getId());
    }

    @Test
    public void tesTitle() {

        Tutorial tutorial = new Tutorial();
        String title = "Java Basics";
        tutorial.setTitle(title);
        assertEquals(title, tutorial.getTitle());
    }

    @Test
    public void testDescription() {

        Tutorial tutorial = new Tutorial();
        String description = "Introduction to java";
        tutorial.setDescription(description);
        assertEquals(description, tutorial.getDescription());
    }
}
