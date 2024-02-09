public class Exception3 {
    public static void main(String args[]){
        try {
            int a=2, b=4,c=2, x=2, z;
            int p[]={2};
            p[2]=43;   // throw a array index out of bond error
            try{
                z=x/((b*b)-4*a*c);     // throw error arithmetic error
                System.out.println("The value z is:"+z);

            }catch(ArithmeticException e){
                System.out.println("division by zero in arithmetic expresion");
            }   
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bound");
        }
    }
}
