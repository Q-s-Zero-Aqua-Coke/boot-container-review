package com.bootcontainerreview.repository;

import com.bootcontainerreview.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}
