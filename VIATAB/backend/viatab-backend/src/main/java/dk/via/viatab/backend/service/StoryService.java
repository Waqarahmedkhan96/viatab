package dk.via.viatab.backend.service;

import dk.via.viatab.backend.model.Story;
import dk.via.viatab.backend.repository.StoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StoryService {

    private final StoryRepository repository;

    public StoryService(StoryRepository repository) {
        this.repository = repository;
    }

    public List<Story> getAllStories() {
        return repository.findAll();
    }

    public Optional<Story> getStoryById(Long id) {
        return repository.findById(id);
    }

    public List<Story> getStoriesByDepartment(String department) {
        return repository.findByDepartment(department);
    }

    public Story addStory(Story story) {
        return repository.save(story);
    }

    public Story updateStory(Long id, Story updatedStory) {
        Story existingStory = repository.findById(id).orElseThrow();

        existingStory.setTitle(updatedStory.getTitle());
        existingStory.setDepartment(updatedStory.getDepartment());
        existingStory.setContent(updatedStory.getContent());

        return repository.save(existingStory);
    }

    public void deleteStory(Long id) {
        repository.deleteById(id);
    }
}