package t2.beginnercoursettwo.les08_exercises.mijnenvegerbyteacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MinesweeperGame {

    private List<Coordinate> bombs;
    private Coordinate[][] coordinates;
    private int numberOfBombs = 10;
    private int numberOfBombsSet;
    private boolean lost;
    private Scanner scanner = new Scanner(System.in);

    public MinesweeperGame() {
        this.reset();
    }

    public boolean continuePlaying() {
        scanner.nextLine();
        System.out.println("Do you want to play again?");
        String yesOrNo = scanner.nextLine();
        if (yesOrNo.equals("yes")) {
            this.reset();
            return true;
        }
        return false;
    }

    public void enterCoordinate() {
        System.out.println("Enter your X coordinate");
        int xCoordinate = scanner.nextInt() - 1;
        System.out.println("Enter your Y coordinate");
        int yCoordinate = scanner.nextInt() - 1;
        Coordinate coordinate = coordinates[xCoordinate][yCoordinate];
        revealCoordinate(coordinate);
    }

    //todo: take look at the logic in this
    private void revealCoordinate(Coordinate coordinate) {
        if (!coordinate.isShown()) {
            lost = coordinate.isBomb();
            coordinate.setFieldValue(String.valueOf(getNumberOfSurroundingBombs(coordinate)));
            coordinate.setShown(true);
            if (!lost && coordinate.getFieldValue().equals("0")) {
                List<Coordinate> neighbourCoordinates = findNonDiagonalNeighbourCoordinates(coordinate);
                for (Coordinate neighbourCoordinate : neighbourCoordinates) {
                    revealCoordinate(neighbourCoordinate);
                }
            }
        }
    }

    private List<Coordinate> findNonDiagonalNeighbourCoordinates(Coordinate coordinate) {
        List<Coordinate> neighbourCoordinates = new ArrayList<>();
        if (coordinate.getX() > 0 && coordinate.getX() < 7) {
            Coordinate leftFromOriginal = coordinates[coordinate.getX() - 1][coordinate.getY()];
            Coordinate rightFromOriginal = coordinates[coordinate.getX() + 1][coordinate.getY()];
            neighbourCoordinates.add(leftFromOriginal);
            neighbourCoordinates.add(rightFromOriginal);
        } else if (coordinate.getX() == 0) {
            Coordinate rightFromOriginal = coordinates[coordinate.getX() + 1][coordinate.getY()];
            neighbourCoordinates.add(rightFromOriginal);
        } else if (coordinate.getX() == 7) {
            Coordinate leftFromOriginal = coordinates[coordinate.getX() - 1][coordinate.getY()];
            neighbourCoordinates.add(leftFromOriginal);
        }

        if (coordinate.getY() > 0 && coordinate.getY() < 7) {
            Coordinate aboveOriginal = coordinates[coordinate.getX()][coordinate.getY() + 1];
            Coordinate beneathOriginal = coordinates[coordinate.getX()][coordinate.getY() - 1];
            neighbourCoordinates.add(aboveOriginal);
            neighbourCoordinates.add(beneathOriginal);
        } else if (coordinate.getY() == 0) {
            Coordinate aboveOriginal = coordinates[coordinate.getX()][coordinate.getY() + 1];
            neighbourCoordinates.add(aboveOriginal);
        } else if (coordinate.getY() == 7) {
            Coordinate beneathOriginal = coordinates[coordinate.getX()][coordinate.getY() - 1];
            neighbourCoordinates.add(beneathOriginal);
        }

        return neighbourCoordinates;
    }

    public boolean hasLost() {
        return lost;
    }

    public boolean gameIsDone() {
        int coordinatesShown = 0;
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                Coordinate coordinate = coordinates[x][y];
                if (coordinate.isShown()) {
                    coordinatesShown++;
                }
            }
        }
        return coordinatesShown == 64 - numberOfBombs;
    }

    public void printField() {
        for (int x = 0; x < 8; x++) {
            System.out.print("|");
            for (int y = 0; y < 8; y++) {
                Coordinate coordinate = coordinates[x][y];
                System.out.print(" " + coordinate.getFieldValue() + " ");
                System.out.print("|");
            }
            System.out.println();
        }
    }

    private void reset() {
        resetVariables();
        initializePlayingField();
        placeBombs();
    }

    private void resetVariables() {
        this.bombs = new ArrayList<>();
        this.coordinates = new Coordinate[8][8];
        this.numberOfBombsSet = 0;
        this.lost = false;
    }

    private void initializePlayingField() {
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                Coordinate coordinate = new Coordinate(x, y);
                coordinates[x][y] = coordinate;
            }
        }
    }

    private void placeBombs() {
        Random random = new Random();
        while(numberOfBombsSet < numberOfBombs) {
            int bombLocationX = random.nextInt(8);
            int bombLocationY = random.nextInt(8);
            Coordinate coordinate = coordinates[bombLocationX][bombLocationY];
            if (!coordinate.isBomb()) {
                coordinate.setBomb(true);
                numberOfBombsSet++;
                bombs.add(coordinate);
            }
        }
    }

    private int getNumberOfSurroundingBombs(Coordinate coordinate) {
        int numberOfSurroundingBombs = 0;
        for (Coordinate bombCoordinate : bombs) {
            int differenceX = Math.abs(coordinate.getX() - bombCoordinate.getX());
            int differenceY = Math.abs(coordinate.getY() - bombCoordinate.getY());
            if (differenceX <= 1 && differenceY <= 1) {
                numberOfSurroundingBombs++;
            }
        }
        return numberOfSurroundingBombs;
    }
}
