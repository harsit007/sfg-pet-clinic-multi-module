package guru.springframework.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "pet_type")
public class PetType extends BaseEntity {

    @Column(name = "name")
    private String name;
    public PetType(String name) {
        super();
        this.name = name;
    }
    public void setName (String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
