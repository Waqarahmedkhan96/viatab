package dk.via.viatab.backend.repository;

import dk.via.viatab.backend.model.Story;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StoryRepository extends JpaRepository<Story, Long> {
    List<Story> findByDepartment(String department);
}