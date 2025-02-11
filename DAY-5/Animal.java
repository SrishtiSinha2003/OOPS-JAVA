class Animal{
    public void animalSound() {
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal{
    public void animalSound() {
        super.animalSound();
        System.out.println("Dog Sound");
    }
        public static void main(String[] args) {
            Dog myDog = new Dog();
            myDog.animalSound();
    }
}
