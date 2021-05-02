package lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {

    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map = new char[SIZE][SIZE];

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победа игрока!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победа машин!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }

    private static boolean checkWin(char dotSymb) {

        for (int i = 0; i < SIZE; i++) { // проверка горизонталей и вертикалей в примере преподавателя
            int numOfDotsLine = 0;
            int numOfDotsColumn = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == dotSymb) {
                    numOfDotsLine++;
                } else {
                    numOfDotsLine = 0;
                }
                if (map[j][i] == dotSymb) {
                    numOfDotsColumn++;
                } else {
                    numOfDotsColumn = 0;
                }
                    if (numOfDotsLine == DOTS_TO_WIN || numOfDotsColumn == DOTS_TO_WIN) return true;
                }
            }

        int numOfDotsMainDiagonal = 0;
        int numOfDotsSecondaryDiagonal = 0;

        for (int i = 0; i < SIZE; i++) { // проверка главной и побочной диагоналей
            if (map[i][i] == dotSymb) {
                numOfDotsMainDiagonal++;
            } else {
                numOfDotsMainDiagonal = 0;
            }
            if (map[i][(SIZE - i - 1)] == dotSymb) {
                numOfDotsSecondaryDiagonal++;
            } else {
                numOfDotsSecondaryDiagonal = 0;
            }
            if (numOfDotsMainDiagonal == DOTS_TO_WIN || numOfDotsSecondaryDiagonal == DOTS_TO_WIN) return true;
        }


        if (SIZE != DOTS_TO_WIN) { // проверка возможных других диагоналей

            int numOfDiagonal = (SIZE - DOTS_TO_WIN);

            for (int i = 1; i <= numOfDiagonal; i++) { // параллельных основной
                int numOfDotsMainParallelPlus = 0;
                int numOfDotsMainParallelMinus = 0;
                for (int j = 0; j < (SIZE - i); j++) {
                    if (map[j][j + i] == dotSymb) {
                        numOfDotsMainParallelPlus++;
                    } else {
                        numOfDotsMainParallelPlus = 0;
                    }
                    if (map[j + i][j] == dotSymb) {
                        numOfDotsMainParallelMinus++;
                    } else {
                        numOfDotsMainParallelMinus = 0;
                    }
                    if (numOfDotsMainParallelPlus == DOTS_TO_WIN || numOfDotsMainParallelMinus == DOTS_TO_WIN) return true;
                }
            }

            for (int i = 1; i <= numOfDiagonal; i++) { // параллельных побочной
                int numOfDotsSecondParallelPlus = 0;
                int numOfDotsSecondParallelMinus = 0;
                for (int j = 0; j < (SIZE - i); j++) {
                    if (map[j][SIZE - i - j - 1] == dotSymb) {
                        numOfDotsSecondParallelPlus++;
                    } else {
                        numOfDotsSecondParallelPlus = 0;
                    }
                    if (map[j + i][SIZE - i - j] == dotSymb) {
                        numOfDotsSecondParallelMinus++;
                    } else {
                        numOfDotsSecondParallelMinus = 0;
                    }
                    if (numOfDotsSecondParallelPlus == DOTS_TO_WIN || numOfDotsSecondParallelMinus == DOTS_TO_WIN) return true;
                }
            }

        }

        return false;
    }

    public static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = isNextLineInt() - 1;
            y = isNextLineInt() - 1;
        } while (!isCorrect(x, y));
        map[x][y] = DOT_X;
    }

    public static boolean isCorrect(int x, int y) {
        if (x > SIZE || x < 0 || y < 0 || y > SIZE) {
            System.out.println("Данные введены не корректно!");
            scanner.nextLine();
            return false;
        }
        if (map[x][y] != DOT_EMPTY) {
            System.out.println("Клетка уже занята!");
            scanner.nextLine();
            return false;
        }
        return true;
    }

    public static int isNextLineInt() {
        return (scanner.hasNextInt() ? scanner.nextInt() : 0);
    }

    public static void aiTurn() {
        int x;
        int y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (map[x][y] != DOT_EMPTY);
        map[x][y] = DOT_O;
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

}
