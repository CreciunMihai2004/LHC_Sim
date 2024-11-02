package particles;

public class proton extends particle {
    private static final double PROTON_MASS = 1.67e-27;  // Masa în kilograme
    private static final double PROTON_CHARGE = 1.6e-19; // Sarcina în coulombi

    public proton(double x, double y, double vx, double vy) {
        super(x, y, vx, vy, PROTON_MASS, PROTON_CHARGE);
    }

    // Metodă pentru a aplica o forță și a actualiza viteza
    public void applyForce(double forceX, double forceY, double deltaTime) {
        // Calculăm accelerația
        double ax = forceX / getMass();
        double ay = forceY / getMass();

        // Actualizăm viteza în funcție de accelerație
        double newVx = getVx() + ax * deltaTime;
        double newVy = getVy() + ay * deltaTime;

        // Setăm noua viteză
        setVelocity(newVx, newVy);
    }

    // Metodă pentru a seta viteza
    // Metodă pentru a seta viteza
    private void setVelocity(double vx, double vy) {
        this.vx = vx;
        this.vy = vy;
    }
}
