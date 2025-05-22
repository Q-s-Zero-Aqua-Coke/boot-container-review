package com.bootcontainerreview.controller;

import com.bootcontainerreview.entity.Pet;
import com.bootcontainerreview.repository.PetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pet")
@RequiredArgsConstructor
public class PetController {

    private final PetRepository petRepository;

    @GetMapping
    public ResponseEntity<List<Pet>> getAll() {
        return ResponseEntity.ok(petRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<Pet> savePet(@RequestBody Pet pet) {
        return ResponseEntity.status(201).body(petRepository.save(pet));
    }
}
