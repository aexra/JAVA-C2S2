package Labs.Classes;

public class Complex {
    // FIELDS
    private double real;
    private double imagine;

    // CONSTRUCTORS
    public Complex(double _real, double _imagine) {
        this.real = _real;
        this.imagine = _imagine;
    }

    // REAL SETTER
    public double getReal() {
        return this.real;
    }
    public double setReal(double _real) {
        this.real = _real;
        return this.real;
    }

    // IMAGINE SETTER
    public double getImagine() {
        return this.imagine;
    }
    public double setImagine(double _imagine) {
        this.imagine = _imagine;
        return this.imagine;
    }

    // OPERATIONS
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
    public Complex remove(Complex _right) {
        var z = Complex.subtract(this, _right);
        this.real = z.getReal();
        this.imagine = z.getImagine();
        return this;
    }
    public Complex remove(double _right) {
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
}
