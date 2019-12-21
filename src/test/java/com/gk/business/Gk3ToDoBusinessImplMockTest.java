package com.gk.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.gk.data.api.TodoService;

public class Gk3ToDoBusinessImplMockTest {

	@Test
	public void testRetrieveTodosRelatedToSpring() {

		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
		when(todoServiceMock.retrieveTodos("Spring")).thenReturn(todos);
		// Above is Mocking is done
		
		TodoBusinessImpl implUnderTest = new TodoBusinessImpl(todoServiceMock);
		List<String> filteredTodos = implUnderTest.retrieveTodosRelatedToSpring("Spring");
		assertEquals(2, filteredTodos.size());

	}

}
