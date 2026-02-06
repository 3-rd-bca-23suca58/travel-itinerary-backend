package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@RestController
@RequestMapping("/api/destinations")
public class DestinationController {

    private List<Destination> destinations = new ArrayList<>();
    private long currentId = 1;

    @CrossOrigin(origins = "http://localhost:3000") // React dev server
    @GetMapping
    public List<Destination> getAll() {
        return destinations;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public Destination create(@RequestBody Destination destination) {
        destination.setId(currentId++);
        destinations.add(destination);
        return destination;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/{id}")
    public Destination update(@PathVariable Long id, @RequestBody Destination updated) {
        for (Destination d : destinations) {
            if (d.getId().equals(id)) {
                d.setName(updated.getName());
                return d;
            }
        }
        return null;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        destinations.removeIf(d -> d.getId().equals(id));
    }
}
