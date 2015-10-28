package info.jdlm;

import java.util.Arrays;

public class Main {

    public static final ChemicalElement HYDROGEN = new ChemicalElement("H", 1, 2.20);

    public static final ChemicalElement OXYGEN = new ChemicalElement("O", 8, 3.44);

    public static final ChemicalElement[] WATER = new ChemicalElement[] { HYDROGEN, HYDROGEN, OXYGEN };

    private static void printElementInfo(ChemicalElement e) {
        System.out.println(e + ":");
        System.out.println("\tatomic number: " + e.getAtomicNumber());
        System.out.println("\telectronegativity: " + e.getElectronegativity());
        System.out.println("\talkali metal?: " + e.isAlkaliMetal());
        System.out.println("\ttransition metal?: " + e.isTransitionMetal());
        System.out.println("\tmetal?: " + e.isMetal());
    }

    public static void main(String[] args) {
        printElementInfo(HYDROGEN);
        printElementInfo(OXYGEN);
        System.out.println("WATER (HILL SORT)");
        Arrays.sort(WATER, new ChemicalElement.HillComparator());
        for (int i = 0; i < WATER.length; ++i) {
            printElementInfo(WATER[i]);
        }
        System.out.println("WATER (DEFAULT SORT)");
        Arrays.sort(WATER);
        for (int i = 0; i < WATER.length; ++i) {
            printElementInfo(WATER[i]);
        }
    }
}
