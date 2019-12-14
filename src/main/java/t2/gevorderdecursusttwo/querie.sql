--for basics
CREATE DATABASE java_gevorderd;
USE java_gevorderd;
CREATE TABLE movie(
title VARCHAR(150) NOT NULL,
description VARCHAR(2000) NOT NULL,
id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
average FLOAT NOT NULL,
popularity FLOAT NOT NULL);
CREATE USER 'dbadmin'@'localhost' IDENTIFIED BY 'dbadmin';
GRANT ALL PRIVILEGES ON java_gevorderd.movie TO 'dbadmin'@'localhost' IDENTIFIED BY 'dbadmin';

--For associations tables
USE java_gevorderd;

CREATE TABLE `user` (
  id int(11) NOT NULL AUTO_INCREMENT,
  first_name varchar(45) NOT NULL,
  last_name varchar(45) NOT NULL,
  age int(11) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE address (
  id int(11) NOT NULL AUTO_INCREMENT,
  street varchar(128) NOT NULL,
  zip_code varchar(10) NOT NULL,
  user_id int(11) NOT NULL,
  PRIMARY KEY (id),
  KEY user_fk (user_id),
  CONSTRAINT user_fk FOREIGN KEY (user_id) REFERENCES user (id)
);

GRANT ALL PRIVILEGES ON java_gevorderd.user TO 'dbadmin'@'localhost' IDENTIFIED BY 'dbadmin';
GRANT ALL PRIVILEGES ON java_gevorderd.address TO 'dbadmin'@'localhost' IDENTIFIED BY 'dbadmin';


--books
USE java_gevorderd;

CREATE TABLE author (
  author_id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(45) NOT NULL,
  email varchar(45) NOT NULL,
  PRIMARY KEY (author_id)
);

CREATE TABLE book (
  book_id int(11) NOT NULL AUTO_INCREMENT,
  title varchar(128) NOT NULL,
  description varchar(512) NOT NULL,
  published date NOT NULL,
  author_id int(11) NOT NULL,
  PRIMARY KEY (book_id),
  KEY author_fk (author_id),
  CONSTRAINT author_fk FOREIGN KEY (author_id) REFERENCES author (author_id)
);

GRANT ALL PRIVILEGES ON java_gevorderd.author TO 'dbadmin'@'localhost' IDENTIFIED BY 'dbadmin';
GRANT ALL PRIVILEGES ON java_gevorderd.book TO 'dbadmin'@'localhost' IDENTIFIED BY 'dbadmin';



--departements
USE java_gevorderd;

CREATE TABLE department (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(45) NOT NULL,
  PRIMARY KEY (id)
);

INSERT INTO department (id, name) VALUES (1, 'IT');

GRANT ALL PRIVILEGES ON java_gevorderd.department TO 'dbadmin'@'localhost' IDENTIFIED BY 'dbadmin';

ALTER TABLE java_gevorderd.user
ADD COLUMN dep_id INT(11) DEFAULT(1),
ADD FOREIGN KEY (dep_id) REFERENCES department(id) ON DELETE CASCADE;

ALTER TABLE `user` CHANGE `dep_id` `dep_id` INT(11) NOT NULL DEFAULT '1';



--school
USE java_gevorderd;

CREATE TABLE `student` (
  `id` bigint(20) NOT NULL,
  `first_name` varchar(250) NOT NULL,
  `last_name` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `student_course` (
  `student_id` bigint(20) NOT NULL,
  `course_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `course` (
  `id` bigint(20) NOT NULL,
  `name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

ALTER TABLE `student` ADD PRIMARY KEY (`id`);

ALTER TABLE `student_course`
  ADD PRIMARY KEY (`student_id`,`course_id`),
  ADD KEY `fk_course_id` (`course_id`);

ALTER TABLE `course` ADD PRIMARY KEY (`id`);

ALTER TABLE `student`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

ALTER TABLE `course`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

ALTER TABLE `student_course`
  ADD CONSTRAINT `fk_student_id` FOREIGN KEY (`student_id`) REFERENCES `student` (`id`),
  ADD CONSTRAINT `fk_course_id` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`);

GRANT ALL PRIVILEGES ON java_gevorderd.student TO 'dbadmin'@'localhost' IDENTIFIED BY 'dbadmin';
GRANT ALL PRIVILEGES ON java_gevorderd.student_course TO 'dbadmin'@'localhost' IDENTIFIED BY 'dbadmin';
GRANT ALL PRIVILEGES ON java_gevorderd.course TO 'dbadmin'@'localhost' IDENTIFIED BY 'dbadmin';