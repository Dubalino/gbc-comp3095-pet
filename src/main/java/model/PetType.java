package model;

public class PetType {

    private String Name;

    public PetType(){
    }

    public PetType(String name){
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
