package com.umlimiscode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class WorkinWithSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("Blue"));
        balls.add(new Ball("Blue"));
        balls.add(new Ball("Yellow"));
        balls.add(new Ball("Red"));
        balls.remove(new Ball("Red"));
        System.out.println(balls.size());
        balls.forEach(System.out::println);
    }

    static  class Ball{
        String colour;
        public Ball(String colour) {
            this.colour = colour;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(colour, ball.colour);
        }

        @Override
        public int hashCode() {
            return Objects.hash(colour);
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "colour='" + colour + '\'' +
                    '}';
        }
    }


    //record Ball(String colour){}
}
