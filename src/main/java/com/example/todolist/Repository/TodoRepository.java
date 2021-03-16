package com.example.todolist.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.todolist.Model.Todo;

// https://spring.pleiades.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html
// DBにアクセスするためのインターフェース
@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
}
