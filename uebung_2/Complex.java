public class Complex {

    private double x,y;

    public Complex(double x, double y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        if(this.y>0){
            return  this.x + " + " + this.y+ "i";
        }else{
            return  this.x + " - " + Math.abs(this.y) + "i";
        }

    }

    public void setX(double number){
        this.x = number;
    }

    public void setY(double number){
        this.y = number;
    }

    public  Complex add(Complex number) {
        return new Complex((this.x + number.x), (this.y + number.y));
    }

    public  Complex sub(Complex number) {
        return new Complex((this.x - number.x), (this.y - number.y));
    }

    public Complex mult(Complex number){
      return new Complex(this.x * number.x - this.y * number.y, this.x * number.y + this.y * number.x);
    }

    public Complex div(Complex c){
        Complex a = this.mult(new Complex(c.x,c.y * - 1));
        Complex b = c.mult(new Complex(c.x, c.y * - 1));

        return new Complex(a.x/b.x,a.y/b.x);


    }

    public static void main(String[] args) {
        Complex z1 = new Complex(1.0,2.0);
        Complex z2 = new Complex(2.0,3.0);
        Complex z5 = new Complex(3.0,4.0);
        Complex z6 = new Complex(5.0,2.0);

        Complex z8 = new Complex(4,3);
        Complex z9 = new Complex(2,2);

        Complex z3 = z1.sub(z2);
        Complex z4 = z1.add(z2);
        Complex z7 = z5.mult(z6);
        Complex zz = z8.div(z9);

        System.out.println(z3.toString());
        System.out.println(z4.toString());
        System.out.println(z7.toString());
        System.out.println(zz.toString());
    }


}
