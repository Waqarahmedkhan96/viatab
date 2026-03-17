package dk.via.viatab.backend.controller;

import dk.via.viatab.backend.model.Story;
import dk.via.viatab.backend.service.StoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/stories")
@CrossOrigin(origins = "http://localhost:3000")
public class StoryController {

    private final StoryService service;

    public StoryController(StoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<Story> getAllStories() {
        return service.getAllStories();
    }

    @GetMapping("/{id}")
    public Optional<Story> getStoryById(@PathVariable Long id) {
        return service.getStoryById(id);
    }

    @GetMapping("/department/{department}")
    public List<Story> getStoriesByDepartment(@PathVariable String department) {
        return service.getStoriesByDepartment(department);
    }

    @PostMapping
    public Story addStory(@RequestBody Story story) {
        return service.addStory(story);
    }

    @PutMapping("/{id}")
    public Story updateStory(@PathVariable Long id, @RequestBody Story story) {
        return service.updateStory(id, story);
    }

    @DeleteMapping("/{id}")
    public void deleteStory(@PathVariable Long id) {
        service.deleteStory(id);
    }
}