package com.example.todolist.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

// データベースから取得したデータを格納するクラス(登録、更新時の値を保持する)
// データベースの1行に対応した形になっている。
@Entity
@Data
@Table(name = "todolist")
public class Todo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String content;

  private boolean done;
}
