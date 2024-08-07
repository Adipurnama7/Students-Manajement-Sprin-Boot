package net.javaguides.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.javaguides.sms.entity.Student;

// Mendefinisikan repositori untuk entitas Student dengan JpaRepository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
