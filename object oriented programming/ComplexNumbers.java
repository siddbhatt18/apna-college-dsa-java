public class ComplexNumbers {
    public static void main(String[] args) {
        Complex c1 = new Complex(4, 5);
        Complex c2 = new Complex(9, 4);
        Complex c3 = Complex.add(c1, c2);
        Complex c4 = Complex.diff(c1, c2);
        Complex c5 = Complex.product(c1, c2);
        c3.printComplex();
        c4.printComplex();
        c5.printComplex();
    }
}
class Complex {
    int real, imag;
    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }
    public static Complex add(Complex a, Complex b) {
        return new Complex((a.real + b.real), (a.imag + b.imag));
    }
    public static Complex diff(Complex a, Complex b) {
        return new Complex((a.real - b.real), (a.imag - b.imag));
    }
    public static Complex product(Complex a, Complex b) {
        return new Complex((a.real * b.real - a.imag * b.imag), (a.real * b.imag + a.imag * b.real));
    }
    public void printComplex() {
        if(real == 0 && imag != 0) {
            System.out.println(imag + "i");
        }
        else if(real != 0 && imag == 0) {
            System.out.println(real);
        }
        else {
            System.out.println(real + " + " + imag + "i");
        }
    }
}