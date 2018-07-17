package design.pattern.strategy.todo;


import design.pattern.strategy.todo.duck.Duck;
import design.pattern.strategy.todo.duck.FlatNoseDuck;
import design.pattern.strategy.todo.duck.WildDuck;

/*
1. Add fly method for current ducks
2. Add new RubberDuck (it's need to squeak instead of quacking, because is RubberDuck!)
3. Is the RubberDuck flying?
4. Add WoodenDuck
5. Is WoodenDuck doing a noise?
6. Is WoodenDuck flying?
 */
public class AppStrategy {
    public static void main(String[] args) {
        Duck duck = new Duck();

        duck.quack();
        duck.swim();
        duck.show();
//        duck.fly();

        duck = new WildDuck();

        duck.quack();
        duck.swim();
        duck.show();
//        duck.fly();

        duck = new FlatNoseDuck();

        duck.quack();
        duck.swim();
        duck.show();
//        duck.fly();
    }
}
