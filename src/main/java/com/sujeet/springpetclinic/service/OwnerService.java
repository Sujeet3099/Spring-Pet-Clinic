package com.sujeet.springpetclinic.service;

import com.sujeet.springpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);

}
