package com.gk.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.gk.data.api.ToDoServiceStub;
import com.gk.data.api.TodoService;

public class Gk1ToDoBusinessImplStubTest {

	@Test
	public void testRetrieveTodosRelatedToSpring() {

		TodoService todoServiceStub = new ToDoServiceStub();
		TodoBusinessImpl implUnderTest = new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTodos = implUnderTest.retrieveTodosRelatedToSpring("Spring");
		assertEquals(2, filteredTodos.size());
		
	}

}
