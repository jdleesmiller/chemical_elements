package info.jdlm;
import java.util.Comparator;

/**
 * A chemical element with symbolic name, atomic number, and its
 * electronegativity.
 */
public class ChemicalElement implements Comparable<ChemicalElement> {

    public static class HillComparator implements Comparator<ChemicalElement> {
        public int compare(ChemicalElement o1, ChemicalElement o2) {
            if (o1.getSymbol() == "C") {
                if (o2.getSymbol() == "C") {
                    return 0;
                }
                return -1;
            }
            if (o1.getSymbol() == "H") {
                if (o2.getSymbol() == "C") {
                    return 1;
                }
                if (o1.getSymbol() == "H") {
                    return 0;
                }
                return -1;
            }
            return o1.getSymbol().compareTo(o2.getSymbol());
        }
    }

    private String symbol;

    private int atomicNumber;

    /**
     * this value measures the affinity to bind an electron
     */
    private double electronegativity;

    /**
     * Creates a new chemical eleent with given symbolic name,
     * atomic number (number of protons), and electronegativity.
     */
    public ChemicalElement(String symbol, int atomicNumber,
                           double electronegativity)  {
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.electronegativity = electronegativity;
    }

    /**
     * Creates a new chemical element with given symbolic name,
     * atomic number, and electronegativity 0.
     */
    public ChemicalElement(String symbol, int electronegativity) {
        this(symbol, electronegativity, 0);
    }

    /**
     * Returns true if and only if this chemical element is a metal.
     */
    public boolean isMetal() {
        switch (atomicNumber) {
            case  49:
            case  50:
            case  81:
            case  82:
            case  83:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117: return true;
        }
        return false;
    }

    /**
     * Returns true if and only if this chemical element is
     * an alkali metal.
     */
    public boolean isAlkaliMetal() {
        switch (atomicNumber) {
            case 3:
            case 11:
            case 19:
            case 37:
            case 55:
            case 87: return true;
        }
        return false;
    }

    /**
     * Retruns true if and only if this chemical metal is
     * a transition metal.
     */
    public boolean isTransitionMetal() {
        return 21 <= atomicNumber && atomicNumber <= 30
                || 29 <= atomicNumber && atomicNumber <= 48
                || 72 <= atomicNumber && atomicNumber <= 80;
    }

    /**
     * Returns the symbolic name of this chemical element (
     * one or two first letter of its latin name).
     */
    public String getSymbol() {
        return symbol.substring(0, 1);
    }

    /**
     * Returns the atomic number (number of protons) of this
     * chemical element.
     */
    public int getAtomicNumber() {
        return atomicNumber;
    }

    public double getElectronegativity() {
        return electronegativity;
    }

    @Override
    public int compareTo(ChemicalElement o) {
        return (int)(this.getElectronegativity() - o.getElectronegativity());
    }

    @Override
    public String toString() {
        return getSymbol();
    }
}

