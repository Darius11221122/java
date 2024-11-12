public class Animal {
    void sound (){
        System.out.println("generic sound");
    }
    void acceptTreatment() {
        System.out.println("The animal is being treated");
    }
    String getDetails(){
        System.out.println("no details");
        return getDetails();
    }
}

//dog
class dog extends Animal {
    @Override
    void sound(){
        System.out.println("sound but dog sound");
    }

    @Override
    String getDetails(){
        return "dog details";
    }
}

//cat
class cat extends Animal {
    @Override
    void sound(){
        System.out.println("cat sound");
    }
    @Override
    void acceptTreatment(){
        System.out.println("Cat is beeing treated");
    }
    @Override
    String getDetails(){
        return "cat details";
    }
}


class Vet {
    void treatAnimal(Animal animal){
        System.out.println("Vet is checking..");
        animal.acceptTreatment();
    }

    private String name;

    public Vet(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    void vaccinate(Animal animal){
        System.out.println("Vet " + name + " is vaccinating");

        if (animal instanceof dog) {
            System.out.println("Dog has been vaccinated: " + animal.getDetails());
        }
        else if (animal instanceof cat) {
            System.out.println("Cog has been vaccinated: " + animal.getDetails());
        }
        else {
            System.out.println("Animal has been vaccinated.");
        }
    }
}