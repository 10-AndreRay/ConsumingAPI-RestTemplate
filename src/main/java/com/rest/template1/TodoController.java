package com.rest.template1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class TodoController {
    @Autowired
    private RestTemplate restTemplate;

    private static final String url = "https://jsonplaceholder.typicode.com/todos";

    @GetMapping("/todos")
    public List<Todo> getAllTodos(@RequestParam(value = "completed", required = false) String completed) {
        if(!(completed == null)) {
            Todo[] todos = restTemplate.getForObject(url + "?completed=" + completed, Todo[].class);
            if(todos != null) {
                return Arrays.asList(todos);
            } else {
                return List.of();
            }
        }
        Todo[] todos = restTemplate.getForObject(url, Todo[].class);
        if(todos != null) {
            return Arrays.asList(todos);
        } else {
            return List.of();
        }
    }

    @GetMapping("/todos/{id}")
    public Todo getTodosById(@PathVariable("id") long id) {
        Todo todo = restTemplate.getForObject(url + "/" + id, Todo.class);
        if(todo != null) {
            return todo;
        } else {
            return new Todo();
        }
    }

    @GetMapping("/todos/user/{id}")
    public List<Todo> getTodosByUserId(@PathVariable("id") long id, @RequestParam(value = "completed", required = false) String completed) {
        if(!(completed == null)) {
            Todo[] todos = restTemplate.getForObject(url + "/?userId=" + id + "&completed=" + completed, Todo[].class);
            if(todos != null) {
                return Arrays.asList(todos);
            } else {
                return List.of();
            }
        }
        Todo[] todos = restTemplate.getForObject(url + "/?userId=" + id, Todo[].class);
        if(todos != null) {
            return Arrays.asList(todos);
        } else {
            return List.of();
        }
    }
}
