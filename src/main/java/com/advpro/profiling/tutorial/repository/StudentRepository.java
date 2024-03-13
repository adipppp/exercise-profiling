package com.advpro.profiling.tutorial.repository;

import com.advpro.profiling.tutorial.model.Student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author muhammad.khadafi
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findFirstByOrderByGpaDesc();

    @Query("select s.name from Student s")
    List<String> findAllName();
}