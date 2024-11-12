public class Main {
    public static void main(String[] args) {
        Animal myDog = new dog();
        Animal myCat = new cat();

        Vet vet = new Vet("Joe");

        vet.treatAnimal(myDog);
        vet.treatAnimal(myCat);

        vet.vaccinate(myCat);
        vet.vaccinate(myDog);
    }
}
