package com.sujeet.springpetclinic.service;

import com.sujeet.springpetclinic.model.Owner;
import com.sujeet.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
