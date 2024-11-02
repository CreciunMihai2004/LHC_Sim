package particles;

public class particle {
    // Atributele particulei
    private double x, y;       // Poziția
    private double vx, vy;     // Viteza
    private double mass;       // Masă
    private double charge;     // Sarcină electrică

    // Constructor pentru a inițializa particula
    public particle(double x, double y, double vx, double vy, double mass, double charge) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        this.mass = mass;
        this.charge = charge;
    }

    // Metodă pentru actualizarea poziției particulei pe baza vitezei curente
    public void updatePosition() {
        x += vx;
        y += vy;
    }

    // Aplicarea unei forțe asupra particulei
    public void applyForce(double fx, double fy) {
        // Calcularea accelerației pe baza forței și masei particulei
        double ax = fx / mass;
        double ay = fy / mass;

        // Actualizarea vitezei în funcție de accelerație
        vx += ax;
        vy += ay;
    }

    // Getteri pentru poziția particulei, utilizabili în desenarea grafică
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Getteri pentru viteza particulei, dacă este nevoie de acestea
    public double getVx() {
        return vx;
    }

    public double getVy() {
        return vy;
    }

    // Gettere pentru proprietăți fizice, dacă ai nevoie de ele în alte clase
    public double getMass() {
        return mass;
    }

    public double getCharge() {
        return charge;
    }
}
