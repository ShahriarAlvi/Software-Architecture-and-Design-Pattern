package concrete_factory.Asteroids;

import product.Asteroids.Asteroids;
import product.Asteroids.Ice_Asteroids;
import product.Asteroids.Iron_Asteroids;
import product.Obstacle;

public class Level1AsteroidsFactory extends AsteroidsFactory {
    @Override
    public Obstacle createObstacle(int score) {
        if(score > 500) return new Ice_Asteroids();
        else return (Asteroids) new Iron_Asteroids();
    }
}
