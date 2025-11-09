package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball ball1 = new Ball();
        Ball ball2 = new Ball();
        Ball ball3 = new Ball();
        Ball[] balls = {ball1, ball2, ball3};
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i].toString());
        }
    }
}
