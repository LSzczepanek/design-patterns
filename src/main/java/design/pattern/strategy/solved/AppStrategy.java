package design.pattern.strategy.solved;

import design.pattern.strategy.solved.duck.*;
import design.pattern.strategy.solved.strategy.fly.FlyBecauseOfWings;
import design.pattern.strategy.solved.strategy.fly.FlyBecauseOfWingsButBackward;
import design.pattern.strategy.solved.strategy.fly.NotFlying;
import design.pattern.strategy.solved.strategy.quak.JustQuak;
import design.pattern.strategy.solved.strategy.quak.NoQuak;
import design.pattern.strategy.solved.strategy.quak.Squeak;

public class AppStrategy {
    public static void main(String[] args) {
        Duck duck;

        duck = new WildDuck(new FlyBecauseOfWings(), new JustQuak());

        duck.quack();
        duck.swim();
        duck.show();
        duck.fly();

        duck = new FlatNoseDuck(new FlyBecauseOfWingsButBackward(), new JustQuak());

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
