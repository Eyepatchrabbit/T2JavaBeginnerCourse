package beginnercoursettwo.les08_exercises.mijnenvegerbyteacher;

public class MinesweeperMain {
//TODO: go through the app and see the logic of it
    public static void main(String[] args) {
        MinesweeperGame minesweeperGame = new MinesweeperGame();
        do {
            minesweeperGame.printField();
            while (!minesweeperGame.hasLost() && !minesweeperGame.gameIsDone()) {
                minesweeperGame.enterCoordinate();
                minesweeperGame.printField();
            }

            if (minesweeperGame.hasLost()) {
                System.out.println("It seems like you triggered a bomb!");
            } else {
                System.out.println("You've won!");
            }
        } while (minesweeperGame.continuePlaying());
    }
}
