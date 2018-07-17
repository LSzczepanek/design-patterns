package design.pattern.strategy.solved;

import design.pattern.strategy.solved.duck.*;
import design.pattern.strategy.solved.strategy.fly.FlyBecauseOfWings;
import design.pattern.strategy.solved.strategy.fly.NotFlying;
import design.pattern.strategy.solved.strategy.quak.JustQuak;
import design.pattern.strategy.solved.strategy.quak.NoQuak;
import design.pattern.strategy.solved.strategy.quak.Squeak;

/*
1. Add fly method for duck
2. Add new RubberDuck (it's need to squeak instead of quacking, because is RubberDuck!)
3. Is the RubberDuck flying?
4. Add WoodenDuck
5. Create an interfaces Flying and Quacking, remove those methods from Duck
6. Is this a solution?
 */
public class AppStrategy {
    public static void main(String[] args) {
        Duck duck;

        duck = new WildDuck(new FlyBecauseOfWings(), new JustQuak());

        duck.quack();
        duck.swim();
        duck.show();
        duck.fly();

        duck = new FlatNoseDuck(new FlyBecauseOfWings(), new JustQuak());

        duck.quack();
        duck.swim();
        duck.show();
        duck.fly();

        duck = new RubberDuck(new NotFlying(), new Squeak());

        duck.quack();
        duck.swim();
        duck.show();
        duck.fly();

        duck = new WoodenDuck(new NotFlying(), new NoQuak());

        duck.quack();
        duck.swim();
        duck.show();
        duck.fly();

    }
}
