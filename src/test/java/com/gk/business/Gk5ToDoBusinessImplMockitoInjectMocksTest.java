package com.gk.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.gk.data.api.TodoService;

@RunWith(MockitoJUnitRunner.class)
public class Gk5ToDoBusinessImplMockitoInjectMocksTest {

	@Mock
	TodoService todoServiceMock; // Internally calls mock() method for mocking an object
	
	@InjectMocks
	TodoBusinessImpl implUnderTest; // This injected Mock object to impl object but not using constructor. Injected
									// by type in instance variable.

	@Test
	public void testRetrieveTodosRelatedToSpring() {

		// TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
		when(todoServiceMock.retrieveTodos("Spring")).thenReturn(todos);

		// TodoBusinessImpl implUnderTest = new TodoBusinessImpl(todoServiceMock);
		List<String> filteredTodos = implUnderTest.retrieveTodosRelatedToSpring("Spring");
		assertEquals(2, filteredTodos.size());

	}

}
