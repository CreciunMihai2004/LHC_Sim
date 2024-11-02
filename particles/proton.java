package particles;

public class proton extends particle {
    // Proprietăți specifice protonului (constante fizice)
    private static final double PROTON_MASS = 1.67e-27;  // Masa în kilograme
    private static final double PROTON_CHARGE = 1.6e-19; // Sarcina în coulombi

    // Constructor care inițializează protonul cu poziția și viteza inițială
    public proton(double x, double y, double vx, double vy) {
        super(x, y, vx, vy, PROTON_MASS, PROTON_CHARGE);
    }

    public proton(double x, double y, double vx, double vy, double mass, double charge) {
        super(x, y, vx, vy, mass, charge);
    }

    // Metode specifice protonului (dacă sunt necesare)
    // Putem adăuga metode suplimentare aici dacă dorim funcționalități speciale
}
