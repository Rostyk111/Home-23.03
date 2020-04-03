public class Main {
    public static void main(String[] args) {

        Fruction fruction = new Fruction();
        VerhovnaRada verhovnaRada = new VerhovnaRada();

        fruction.addDeputi(new Deputy("Roman", "Orlov", 23, false));
        fruction.addDeputi(new Deputy("Oleg", "Belov", 34, true));
        fruction.addDeputi(new Deputy("Max", "Ivanov", 34, false));
        fruction.addDeputi(new Deputy("Andrey", "Brov", 44, false));
        fruction.addDeputi(new Deputy("Aron", "Beil", 26, true));



        fruction.printAllDeputy();

        fruction.printBiggerBriber();






    }
}

