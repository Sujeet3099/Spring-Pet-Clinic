package com.sujeet.springpetclinic.service;

import com.sujeet.springpetclinic.model.Owner;
import com.sujeet.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
