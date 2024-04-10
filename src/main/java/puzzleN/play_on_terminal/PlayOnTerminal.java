package puzzleN.play_on_terminal;
import puzzleN.business_logic.Direction;
import puzzleN.business_logic.PuzzleN;

import java.util.logging.Logger;
import java.util.Scanner;

/**
 *
 * @author valyis
 */
public class PlayOnTerminal {
    static final Logger logger = Logger.getLogger(PlayOnTerminal.class.getName());
    static int size = -1;
    static PuzzleN puzzle = null;
    static Scanner scanner;

    public static void readInSize() {
        scanner = new Scanner(System.in);
        System.out.print("Add meg a pálya méretét pozitív egész számként: ");
        String read = null;
        while (size<=0) {
            try {
                read = scanner.nextLine();
                size = Integer.parseInt(read);
            } catch(NumberFormatException ex) {logger.warning("nem egész szám az input");}
            if (size <=0) {
                System.out.print("\nAdd meg a pálya méretét POZITÍV egész számként: ");
            }
        }
    }

    private static Direction directionByChar(Character c){
        switch (Character.toLowerCase(c.charValue())  ) {
            case 'a': return Direction.WEST;
            case 'w': return Direction.NORTH;
            case 'd': return Direction.EAST;
            case 's': return Direction.SOUTH;
            default: return null;
        }
    }

    public static void playOnRandomTable() {
        readInSize();
        puzzle = PuzzleN.getRandomPuzzle(size);
        playOn(puzzle);
    }

    public static void playOn(PuzzleN puzzle) {
        System.out.println("A lépések: a kurzor billentyűt egyszer megnyomva tudsz lépni.\nAz 'x' karaktert megnyomva tudod abbahagyni.\nEbből a puzzle-állásból kell megoldanod: \n"+puzzle);
        Character userInput = ' ';
        boolean solved = false;
        while (userInput != 'x' && userInput != 'X' && !solved) {
            System.out.println("A lépésed ide üsd be a/s/d/w: ");
            userInput = scanner.nextLine().charAt(0);
            Direction dir = directionByChar(userInput);
            if (dir != null ) {
                if (puzzle.stepIsAllowed(dir)) {
                    puzzle.doStep(dir);
                    System.out.println(puzzle);
                }
                else System.out.println("A lépés nem megengedett");
            }
            solved = puzzle.isSolution();
            if (solved) System.out.println("Kész a megoldás, köszönjük");
        }
    }


    public static void editing_then_playing() {
        readInSize();
        puzzle = new PuzzleN(size);
        System.out.println("A lépések: a kurzor billentyűt egyszer megnyomva tudsz lépni.\n"+
                "Az 'x' karaktert megnyomva tudod abbahagyni.\n"+
                "Az 'i' karaktert megnyomva tudsz beolvasni egy előzetesen mentett pályát\n"+
                "Az 'o' karaktert megnyomva tudod elmenteni az aktuális pályát : \n"+puzzle);
        Character userInput = ' ';
        while (userInput != 'x' && userInput != 'X') {
            System.out.println("A lépésed ide üsd be a/s/d/w: ");
            userInput = scanner.nextLine().charAt(0);
            if (userInput == 'o') {
                puzzle.printToTextFile("mentés.txt");
            }
            else if (userInput == 'i') {
                puzzle.readFromTextFile("mentés.txt");
            }
            else if (userInput == 'p') {playOn(puzzle);}
            else if (userInput == 'r') {playOnRandomTable();}
            else {
                Direction dir = directionByChar(userInput);
                if (dir != null) {
                    if (puzzle.stepIsAllowed(dir)) {
                        puzzle.doStep(dir);
                        System.out.println(puzzle);
                    } else {
                        System.out.println("A lépés nem megengedett");
                    }
                }
            }
        }
    }

    public static void main(String[] a) {
        editing_then_playing();
    }


}

