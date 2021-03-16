create table if not exists todolist (
  id integer not null auto_increment,
  content text not null,
  done boolean not null default 0,
  primary key (id)
);