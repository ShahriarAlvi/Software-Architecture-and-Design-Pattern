import abstract_factory.ObstacleFactory;
import concrete_factory.Asteroids.Level1AsteroidsFactory;
import concrete_factory.Asteroids.Level2AsteroidsFactory;
import concrete_factory.BlackHoles.Level1BlackHolesFactory;
import concrete_factory.BlackHoles.Level2BlackHolesFactory;
import concrete_factory.DebrisField.Level1DebrisFieldFactory;
import concrete_factory.DebrisField.Level2DebrisFieldFactory;
import concrete_factory.SolarFlares.Level1SolarFlaresFactory;
import concrete_factory.SolarFlares.Level2SolarFlaresFactory;
import concrete_factory.SpaceMines.Level1SpaceMinesFactory;
import concrete_factory.SpaceMines.Level2SpaceMinesFactory;
import product.Obstacle;

public class Client {

    public static void main(String[] args) {
        int level = (int) (Math.random() * 2) + 1;

        ObstacleFactory factory;

        if (level == 1) factory = new Level1AsteroidsFactory();
        else factory = new Level2AsteroidsFactory();

        int score = (int) (Math.random() * 2000);

        Obstacle obstacle = factory.createObstacle(score);
        obstacle.show();

        if (level == 1) factory = new Level1DebrisFieldFactory();
        else factory = new Level2DebrisFieldFactory();

        obstacle = factory.createObstacle(score);
        obstacle.show();

        if (level == 1) factory = new Level1SpaceMinesFactory();
        else factory = new Level2SpaceMinesFactory();

        obstacle = factory.createObstacle(score);
        obstacle.show();

        if (level == 1) factory = new Level1BlackHolesFactory();
        else factory = new Level2BlackHolesFactory();

        obstacle = factory.createObstacle(score);
        obstacle.show();

        if (level == 1) factory = new Level1SolarFlaresFactory();
        else factory = new Level2SolarFlaresFactory();

        obstacle = factory.createObstacle(score);
        obstacle.show();


    }
}
