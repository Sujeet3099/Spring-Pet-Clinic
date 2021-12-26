package com.sujeet.springpetclinic.service.map;

import com.sujeet.springpetclinic.model.Owner;
import com.sujeet.springpetclinic.service.CrudService;

import java.util.Set;

public class OwnerMapService extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long> {

    @Override
    public Set<Owner> findByAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object, object.getId());
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
