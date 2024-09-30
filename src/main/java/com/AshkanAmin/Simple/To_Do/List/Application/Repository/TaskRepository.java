package com.AshkanAmin.Simple.To_Do.List.Application.Repository;

import com.AshkanAmin.Simple.To_Do.List.Application.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(Status status);

    List<Task> findByDueDate(LocalDate dueDate);

}
