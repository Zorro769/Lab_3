public class Main {
    public static void main(String[] args) {
        Eagle eagle_1 = new Eagle();
        Eagle eagle_2 = new Eagle("duck");
        Eagle eagle_3 = new Eagle("wolf",30.5);
        Duck duck_1 = new Duck();
        Duck duck_2 = new Duck("eagle");
        Duck duck_3 = new Duck("worm",10.5);
        System.out.println(eagle_1.Eat());
        System.out.println(eagle_1.Move());
        System.out.println(duck_1.Eat());
        System.out.println(duck_1.Move());
        System.out.println(eagle_2.Eat());
        System.out.println(eagle_2.Move());
        System.out.println(duck_2.Eat());
        System.out.println(duck_2.Move());
        System.out.println(eagle_3.Move());
        System.out.println(eagle_3.Eat());
        System.out.println(duck_3.Move());
        System.out.println(duck_3.Eat());
    }
}
abstract class Bird {
    String eat;
    abstract String Eat();
    abstract String Move();
}

class Eagle extends Bird{

    double flySpeed;
    public Eagle() {
        eat = "chickens";
        flySpeed = 10;
    }
    public Eagle(String food,Double... speed)
    {
        eat = food;
        if(speed.length > 0)
            this.flySpeed = speed[0];
        else
            this.flySpeed = 10;
    }
    @Override
    String Eat() {
        return ("Eagle is eating " + eat);
    }

    @Override
    String Move() {
        return ("Eagle is moving with the speed: " + flySpeed);
    }
}
class Duck extends Bird{
    double footSpeed;
    Duck(){
        eat = "Wheat";
        footSpeed = 5;
    }
    Duck(String food,Double... speed)
    {
        eat = food;
        if(speed.length > 0)
        {
            this.footSpeed = speed[0];
        }
        else
        {
            this.footSpeed = 10;
        }
    }
    @Override
    String Move() {
        return ("Duck is moving with the speed " + footSpeed);
    }

    @Override
    String Eat() {
        return ("Duck is eating " + eat);
    }
}