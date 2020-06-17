package application;

import boardgame.Board;
import boardgame.Position;

public class Program {

    public static void main(String[] args) {
        Position pos = new Position(3,5);
        System.out.println(pos);
        
        Board boar = new Board(8, 8);
    }
}
