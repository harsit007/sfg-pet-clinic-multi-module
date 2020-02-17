package guru.springframework.sfgpetclinic.services.map;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet,Long>{

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
    @Override
    public void delete(Pet Pet) {
        super.delete(Pet);;
    }
    @Override
    public Pet save(Pet Pet) {
        return super.save(Pet.getId() , Pet);
    }
       
}