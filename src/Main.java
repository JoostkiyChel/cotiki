//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        DogPet dog = new DogPet();
        CatPet cat = new CatPet();
        dog.eat();
        dog.sound();
        dog.play();

        cat.eat();
        cat.sound();
        cat.play();
    }
}

class dog implements Animal{

    @Override
    public void eat() {
        System.out.println("Собака ест корм");
    }

    @Override
    public void sound() {
        System.out.println("гав");
    }
}

class cat implements Animal{

    @Override
    public void eat() {
        System.out.println("Кошка ест рыбку");
    }

    @Override
    public void sound() {
        System.out.println("мяу");
    }
}

class DogPet extends dog implements pet{

    @Override
    public void play() {
        System.out.println("Собака играет с мячиком");
    }
}

class CatPet extends cat implements pet{

    @Override
    public void play() {
        System.out.println("Кот играет с веревкой");
    }
}