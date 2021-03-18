package com.example.todolist.Service;

import java.util.List;
import java.util.Optional;

import com.example.todolist.Model.Todo;
import com.example.todolist.Repository.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// DBとの具体的な処理(データの取得、新規作成など)を記述するクラス
@Service
public class TodoService {
  
  @Autowired
  TodoRepository todoRepository;

  public List<Todo> searchAll() {
    return todoRepository.findAll();
  }

  // Todoを新たにDBに登録する
  public void addTodo(Todo todo) {
    todoRepository.save(todo);
  }

  // idに応じたTodoを返却する
  public Todo findById(Integer id) {
    Optional<Todo> updateTodo = todoRepository.findById(id);
    return updateTodo.get();
  }
}
