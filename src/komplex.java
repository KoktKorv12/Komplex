public class komplex {
    private double img;
    private double real;

    public komplex(double re, double img) {
        this.real = re;
        this.img = img;
    }

    public double getReal() {
        return real;
    }

    public double getImg() {   // getters för img och real
        return img;
    }

    public komplex add(komplex b) {   // adderar img med real
        double real = this.getReal() + b.getReal();
        double img = this.getImg() + b.getImg();

        return new komplex(real, img);

    }

    @Override
    public String toString() {   // adderar real + img så det kan skrivas ut korrekt
        return "komplex " +
                  real +
                " + " + img +
                "i";
    }

    public komplex Multiply(komplex b){  //komplext tal multiplikation
        double real = ((this.getReal() * b.getReal()) - (this.getImg() * b.getImg()));
        double img = ((this.getImg() * b.getReal()) + (this.getReal() * b.getImg()));

        return new komplex(real, img);
    }

    public komplex arg(komplex b) {
        if (this.getReal() > 0) {
            double arctan = this.getImg() / this.getReal();
        } else if (this.getImg() >= 0 || this.getReal() < 0) {

        }
        return new komplex(real, img);
    }
}