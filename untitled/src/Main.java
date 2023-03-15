public class Main {
    public static void main(String[] args) {
        Eagle obj_1 = new Eagle();
        Duck obj_2 = new Duck();
        obj_1.Eat();
        obj_1.Move();
        obj_2.Eat();
        obj_2.Move();
    }
}
abstract class Bird {
    abstract void Eat();
    abstract void Move();
}

class Eagle extends Bird{
    @Override
    void Eat() {
        System.out.println("Eagle is eating ");
    }

    @Override
    void Move() {
        System.out.println("Eagle is moving ");
    }
}
class Duck extends Bird{
    @Override
    void Move() {
        System.out.println("Duck is moving ");
    }

    @Override
    void Eat() {
        System.out.println("Duck is eating");
    }
}