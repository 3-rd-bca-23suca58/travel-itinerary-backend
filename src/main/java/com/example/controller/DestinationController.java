package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/destinations")
public class DestinationController {

    private List<Destination> destinations = new ArrayList<>();
    private long currentId = 1;

    @GetMapping
    public List<Destination> getAll() {
        return destinations;
    }

    @PostMapping
    public Destination create(@RequestBody Destination destination) {
        destination.setId(currentId++);
        destinations.add(destination);
        return destination;
    }

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

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        destinations.removeIf(d -> d.getId().equals(id));
    }
}