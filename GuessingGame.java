import java.util.Scanner;


abstract class Animal {
    protected String name;
    protected int legs;
    protected boolean isPet;
    protected boolean isFlexible;

    public Animal(String name, int legs, boolean isPet, boolean isFlexible) {
        this.name = name;
        this.legs = legs;
        this.isPet = isPet;
        this.isFlexible = isFlexible;
    }

    public String getName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }

    public boolean isPet() {
        return isPet;
    }

    public boolean isFlexible() {
        return isFlexible;
    }

    // This is the method we used so that when someone enters the attributes an ascii art of the animal is displayed 
    public abstract void displayAsciiArt();
}

// Dog class extending Animal
class Dog extends Animal {
    public Dog() {
        super("Dog", 4, true, false);
    }

    @Override
    public void displayAsciiArt() {
        System.out.println("  ,_-~~~-,    _-~~-_");
        System.out.println(" /        ^-_/      \\_    _-~-.");
        System.out.println("|      /\\  ,          `-_/     \\");
        System.out.println("|   /~^\\ '/  /~\\  /~\\   / \\_    \\");
        System.out.println(" \\_/    }/  /        \\  \\ ,_\\    }");
        System.out.println("        Y  /  /~  /~  |  Y   \\   |");
        System.out.println("       /   | {Q) {Q)  |  |    \\_/");
        System.out.println("       |   \\  _===_  /   |");
        System.out.println("       /  >--{     }--<  \\");
        System.out.println("     /~       \\_._/       ~\\");
        System.out.println("    /    *  *   Y    *      \\");
        System.out.println("    |      * .: | :.*  *    |");
        System.out.println("    \\    )--__==#==__--     /");
        System.out.println("     \\_      \\  \\  \\      ,/");
        System.out.println("       '~_    | |  }   ,~'");
        System.out.println("          \\   {___/   /");
        System.out.println("           \\   ~~~   /");
        System.out.println("   BORNE   /\\._._._./\\");
        System.out.println("          {    ^^^    }");
        System.out.println("           ~-_______-~");
        System.out.println("            /       \\");
    }
}




// Cat class extending Animal
class Cat extends Animal {
    public Cat() {
        super("Cat", 4, true, true);
    }

    @Override
    public void displayAsciiArt() {
        System.out.println(" ,_     _");
        System.out.println(" |\\_,-~/");
        System.out.println(" / _  _ |    ,--.");
        System.out.println("(  @  @ )   / ,-'");
        System.out.println(" \\  _T_/-._( (");
        System.out.println(" /         `. \\");
        System.out.println("|         _  \\ |");
        System.out.println(" \\ \\ ,  /      |   Borne");
        System.out.println("  || |-\\__   /");
        System.out.println(" ((_/`(____,-'");
    }
}




// Chicken class extending Animal
class Chicken extends Animal {
    public Chicken() {
        super("Chicken", 2, false, false);
    }

    @Override
    public void displayAsciiArt() {
        System.out.println("      ,~.");
        System.out.println("   ,-'__ `-,");
        System.out.println("  {,-'  `. }              ,')");
        System.out.println(" ,( a )   `-.__         ,',')~,");
        System.out.println("<=.) (         `-.__,==' ' ' '}");
        System.out.println("  (   )                      /");
        System.out.println("   `-'\\   ,                  )");
        System.out.println("       |  \\        `~.      /");
        System.out.println("       \\   `._        \\    /");
        System.out.println("        \\     `._____,'   /");
        System.out.println("         `-.            ,'");
        System.out.println("            `-.      ,-");
        System.out.println("               `~~~~'");
        System.out.println("               //_||");
        System.out.println("            __//--'/`   Borne");
        System.out.println("          ,--'/`  '");
        System.out.println("             '");
    }
}





// Cow class extending Animal
class Cow extends Animal {
    public Cow() {
        super("Cow", 4, false, false);
    }

    @Override
    public void displayAsciiArt() {
        System.out.println("             .=     ,        =.");
        System.out.println("  _  _   /'/    )\\,/,/(_   \\ \\");
        System.out.println("   `//-.|  (  ,\\\\)\\//\\)\\/\\  ) |");
        System.out.println("   //___\\   `\\\\/\\/\\/\\\\///'  /");
        System.out.println(",-\"~`-._ `\"--'_   `\"\"\"`  _ \\`'\"~-.,_");
        System.out.println("\\       `-.  '_`.      .'_` \\ ,-\"~`/");
        System.out.println(" `.__.-'`/   (-\\        /-) |-.__,'");
        System.out.println("   ||   |     \\O)  /^\\ (O/  |");
        System.out.println("   `\\\\  |         /   `\\    /");
        System.out.println("     \\\\  \\       /      `\\ /");
        System.out.println("      `\\\\ `-.  /' .---.--.\\");
        System.out.println("        `\\/`~(, '()      ('");
        System.out.println("         /(O) \\\\   _,.-.,_)");
        System.out.println("        //  \\\\ `\\'`      /");
        System.out.println("borne  / |  ||   `\"\"\"\"~\"`");
        System.out.println("     /'  |__||");
        System.out.println("           `o");
    }
}







// Snake class extending Animal
class Snake extends Animal {
    public Snake() {
        super("Snake", 0, false, false);
    }

    @Override
    public void displayAsciiArt() {
        System.out.println("          /^\\/^\\");
        System.out.println("         _|__|  O|");
        System.out.println(" \\/     /~     \\_/ \\");
        System.out.println("  \\____|__________/  \\");
        System.out.println("         \\_______      \\");
        System.out.println("                 `\\     \\                 \\");
        System.out.println("       Borne       |     |                  \\");
        System.out.println("                  /      /                    \\");
        System.out.println("                 /     /                       \\\\");
        System.out.println("               /      /                         \\ \\");
        System.out.println("              /     /                            \\  \\");
        System.out.println("            /     /             _----_            \\   \\");
        System.out.println("           /     /           _-~      ~-_         |   |");
        System.out.println("          (      (        _-~    _--_    ~-_     _/   |");
        System.out.println("           \\      ~-____-~    _-~    ~-_    ~-_-~    /");
        System.out.println("             ~-_           _-~          ~-_       _-~");
        System.out.println("                ~--______-~                ~-___-~");
    }
}






// Factory class to create animals
class AnimalFactory {
    public static Animal createAnimal(String type) {
        switch (type) {
            case "Dog": return new Dog();
            case "Cat": return new Cat();
            case "Chicken": return new Chicken();
            case "Cow": return new Cow();
            case "Snake": return new Snake();
            default: return null;
        }
    }
}




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




public class GuessingGame {

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Animal Guessing Game ");
        System.out.println("Answer the following questions to guess the animal.");

        System.out.print("How many legs does the animal have? ");
        int legs = scanner.nextInt();

        System.out.print("Is the animal kept as a pet? (true/false) ");
        boolean isPet = scanner.nextBoolean();

        Animal guessedAnimal = guessAnimal(legs, isPet, scanner);

        if (guessedAnimal != null) {
            System.out.println("I guess the animal is a " + guessedAnimal.getName() + ".");
            guessedAnimal.displayAsciiArt();
        } else {
            System.out.println("Animal Does not exist try again.");
        }

        scanner.close();
    }

    private Animal guessAnimal(int legs, boolean isPet, Scanner scanner) {
        switch (legs) {
            case 4:
                if (isPet) {
                    System.out.print("Is the animal very flexible? (true/false) ");
                    boolean isFlexible = scanner.nextBoolean();
                    if (isFlexible) {
                        return AnimalFactory.createAnimal("Cat");
                    } else {
                        return AnimalFactory.createAnimal("Dog");
                    }
                } else {
                    return AnimalFactory.createAnimal("Cow");
                }
            case 2:
                return AnimalFactory.createAnimal("Chicken");
            case 0:
                return AnimalFactory.createAnimal("Snake");
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        game.start();
    }
}
