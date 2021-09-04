package reflection;

public class Animal {
    String name ;
    int age;
    String breed;
    @Deprecated
    private String lastName;
    public Animal(String name, int age, String breed,String lastName){
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.lastName = lastName;
    }
    public void bark(){
        System.out.println("haf haf ");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
