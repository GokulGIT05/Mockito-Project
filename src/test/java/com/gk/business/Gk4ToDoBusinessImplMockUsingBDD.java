package com.gk.business;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.BDDMockito.*;
import static org.hamcrest.CoreMatchers.is;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.gk.data.api.TodoService;

public class Gk4ToDoBusinessImplMockUsingBDD {

	@Test
	public void testRetrieveTodosRelatedToSpring() {

		// 1. Given
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
		given(todoServiceMock.retrieveTodos("Spring")).willReturn(todos);
		TodoBusinessImpl implUnderTest = new TodoBusinessImpl(todoServiceMock);
		// Above is Mocking is done
		
		// 2. When
		List<String> filteredTodos = implUnderTest.retrieveTodosRelatedToSpring("Spring");
		
		// 3. Then
		// assertEquals(2, filteredTodos.size());
		assertThat(filteredTodos.size(), is(2)); // is from hamcrest

	}

}
