import java.util.ArrayList;

public interface EquationSolver {
    /**
     * Résout une équation du second degré ax^2 + bx + c = 0.
     *
     * @param a Coefficient de x^2
     * @param b Coefficient de x
     * @param c Terme constant
     * @return Une ArrayList contenant les solutions réelles
     * @throws IllegalArgumentException si le coefficient 'a' est égal à 0 ou s'il n'y a pas de solutions réelles.
     */
    ArrayList<Double> solve(double a, double b, double c) throws IllegalArgumentException;
}
