package com.example.todolist.Controller;

import java.util.List;

import com.example.todolist.Model.Todo;
import com.example.todolist.Service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class TodoController {

  @Autowired
  TodoService todoService;
  
  @GetMapping("/")
  public String home(Model model) {
    List<Todo> allTodo = todoService.searchAll();
    model.addAttribute("allTodo", allTodo);
    return "home";
  }
}
