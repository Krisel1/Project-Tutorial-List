package com.APP.Lista.de.Tutoriales;

import com.APP.Lista.de.Tutoriales.Modules.Tutorial;
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
	public void testCreateTutorial(){
		//Arrange
		Tutorial newTutorial = new Tutorial();
		newTutorial.setId(1);
		newTutorial.setName("New Tutorial");

		when(iTutorialRepository.save(any(Tutorial.class))).thenReturn(newTutorial);

		//Act
		Tutorial result = tutorialServices.createTutorial(newTutorial);

		//Assert
		assertNotNull(result);
		assertEquals("New Tutorial", result.getName());
		verify(iTutorialRepository).save(newTutorial);
	}




	@Test
	void contextLoads() {
	}

}
