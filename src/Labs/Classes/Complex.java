package Labs.Classes;

import java.text.MessageFormat;

public class Complex {
    // FIELDS
    private double real = 0;
    private double imagine = 0;

    // CONSTRUCTORS
    public Complex(double _real, double _imagine) {
        this.real = _real;
        this.imagine = _imagine;
    }

    // REAL GETTER & SETTER
    public double getReal() {
        return this.real;
    }
    public double setReal(double _real) {
        this.real = _real;
        return this.real;
    }

    // IMAGINE GETTER & SETTER
    public double getImagine() {
        return this.imagine;
    }
    public double setImagine(double _imagine) {
        this.imagine = _imagine;
        return this.imagine;
    }

    // ARGUMENT GETTER
    public double getArg() {
        return Math.atan2(this.imagine, this.real);
    }

    // MODULE GETTER
    public double getModule() {
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imagine, 2));
    }

    // OPERATIONS
    // ==
    public static boolean equal(Complex _left, Complex _right) {
        return _left.getReal() == _right.getReal() && _left.getImagine() == _right.getImagine();
    }
    public static boolean equal(double _left, Complex _right) {
        return _left == _right.getReal() && _right.getImagine() == 0;
    }
    public static boolean equal(Complex _left, double _right) {
        return _left.getReal() == _right && _left.getImagine() == 0;
    }
    // +
    public static Complex concat(Complex _left, Complex _right) {
        return new Complex(_left.getReal() + _right.getReal(), _left.getImagine() + _right.getImagine());
    }
    public static Complex concat(double _left, Complex _right) {
        return new Complex(_left + _right.getReal(), _right.getImagine());
    }
    public static Complex concat(Complex _left, double _right) {
        return new Complex(_left.getReal() + _right, _left.getImagine());
    }
    // -
    public static Complex subtract(Complex _left, Complex _right) {
        return new Complex(_left.getReal() - _right.getReal(), _left.getImagine() - _right.getImagine());
    }
    public static Complex subtract(double _left, Complex _right) {
        return new Complex(_left - _right.getReal(), -_right.getImagine());
    }
    public static Complex subtract(Complex _left, double _right) {
        return new Complex(_left.getReal() - _right, _left.getImagine());
    }
    // *
    public static Complex multiply(Complex _left, Complex _right) {
        return new Complex(
            _left.getReal() * _right.getReal() - _left.getImagine() * _right.getImagine(), 
            _left.getReal() * _right.getImagine() - _right.getReal() * _left.getImagine()
        );
    }
    public static Complex multiply(double _left, Complex _right) {
        return new Complex(
            _left * _right.getReal(), 
            _left * _right.getImagine()
        );
    }
    public static Complex multiply(Complex _left, double _right) {
        return new Complex(
            _left.getReal() * _right, 
            _right * _left.getImagine()
        );
    }
    // /
    public static Complex divide(Complex _left, Complex _right) {
        return new Complex(
            (_left.getReal() * _right.getReal() + _left.getImagine() * _right.getImagine()) / (Math.pow(_right.getReal(), 2) + Math.pow(_right.getImagine(), 3)),
            (_right.getReal() * _left.getImagine() + _left.getReal() * _right.getImagine()) / (Math.pow(_right.getReal(), 2) + Math.pow(_right.getImagine(), 3))
        );
    }
    public static Complex divide(double _left, Complex _right) {
        return new Complex(
            _left * _right.getReal() / (Math.pow(_right.getReal(), 2) + Math.pow(_right.getImagine(), 3)),
            _left * _right.getImagine() / (Math.pow(_right.getReal(), 2) + Math.pow(_right.getImagine(), 3))
        );
    }
    public static Complex divide(Complex _left, double _right) {
        return new Complex(
            _left.getReal() * _right / Math.pow(_right, 2),
            _right * _left.getImagine() / Math.pow(_right, 2)
        );
    }
    // ===
    public boolean equal(Complex _right) {
        return Complex.equal(this, _right);
    }
    public boolean equal(double _right) {
        return Complex.equal(this, _right);
    }
    // +=
    public Complex add(Complex _right) {
        var z = Complex.concat(this, _right);
        this.real = z.getReal();
        this.imagine = z.getImagine();
        return this;
    }
    public Complex add(double _right) {
        var z = Complex.concat(this, _right);
        this.real = z.getReal();
        this.imagine = z.getImagine();
        return this;
    }
    // -=
    public Complex subtract(Complex _right) {
        var z = Complex.subtract(this, _right);
        this.real = z.getReal();
        this.imagine = z.getImagine();
        return this;
    }
    public Complex subtract(double _right) {
        var z = Complex.subtract(this, _right);
        this.real = z.getReal();
        this.imagine = z.getImagine();
        return this;
    }
    // *=
    public Complex multiply(Complex _right) {
        var z = Complex.multiply(this, _right);
        this.real = z.getReal();
        this.imagine = z.getImagine();
        return this;
    }
    public Complex multiply(double _right) {
        var z = Complex.multiply(this, _right);
        this.real = z.getReal();
        this.imagine = z.getImagine();
        return this;
    }
    // /=
    public Complex divide(Complex _right) {
        var z = Complex.divide(this, _right);
        this.real = z.getReal();
        this.imagine = z.getImagine();
        return this;
    }
    public Complex divide(double _right) {
        var z = Complex.divide(this, _right);
        this.real = z.getReal();
        this.imagine = z.getImagine();
        return this;
    }

    // ELEMENTARY FUNCTIONS METHODS
    public static Complex exp(Complex z) {
        return new Complex(
            Math.exp(z.getReal()) * Math.cos(z.getImagine()),
            Math.exp(z.getReal()) * Math.sin(z.getImagine())
        );
    }
    public static Complex sin(Complex z) {
        return new Complex(
            Math.sin(z.getReal()) * Math.cosh(z.getImagine()),
            Math.cos(z.getReal()) * Math.sinh(z.getImagine())
        );
    }
    public static Complex cos(Complex z) {
        return new Complex(
            Math.cos(z.getReal()) * Math.cosh(z.getImagine()),
            -Math.sin(z.getReal()) * Math.sinh(z.getImagine())
        );
    }
    public static Complex tan(Complex z) {
        return sin(z).divide(cos(z));
    }
    public static Complex atan(Complex z) {
        Complex quotient = (new Complex(1, 0).subtract(new Complex(0, 1).multiply(z))).divide(new Complex(1, 0).add(new Complex(0, 1).multiply(z)));
        return new Complex(0, -0.5).multiply(
            log(new Complex(1, 0).subtract(quotient)).subtract(log(new Complex(1, 0).add(quotient)))
        );
    }
    public static Complex sinh(Complex z) {
        return new Complex(
            Math.sinh(z.getReal()) * Math.sin(z.getImagine()),
            Math.cosh(z.getReal()) * Math.cos(z.getImagine())
        );
    }
    public static Complex cosh(Complex z) {
        return new Complex(
            Math.cosh(z.getReal()) * Math.cos(z.getImagine()),
            Math.sinh(z.getReal()) * Math.sin(z.getImagine())
        );
    }
    public static Complex tanh(Complex z) {
        return sinh(z).divide(cosh(z));
    }
    public static Complex coth(Complex z) {
        return (new Complex(1, 0).add(new Complex(0, 1).multiply(z))).divide(new Complex(1, 0).subtract(new Complex(0, 1).multiply(z)));
    }
    public static Complex log(Complex z) {
        return new Complex(
            Math.log(z.getModule()),
            z.getArg()
        );
    }
    public Complex exp() {
        return Complex.exp(this);
    }
    public Complex sin() {
        return Complex.sin(this);
    }
    public Complex cos() {
        return Complex.cos(this);
    }
    public Complex tan() {
        return Complex.tan(this);
    }
    public Complex atan() {
        return Complex.atan(this);
    }
    public Complex sinh() {
        return Complex.sinh(this);
    }
    public Complex cosh() {
        return Complex.cosh(this);
    }
    public Complex tanh() {
        return Complex.tanh(this);
    }
    public Complex coth() {
        return Complex.coth(this);
    }
    public Complex log() {
        return Complex.log(this);
    }

    // OTHER METHODS
    public String toString() {
        return MessageFormat.format("{0} + i*{1}", this.real, this.imagine);
    }
    public String toString(boolean T) {
        if (!T) return this.toString();
        return MessageFormat.format("{0}*(cos({1})+i*sin({1}))", getModule(), getArg());
    }
}
