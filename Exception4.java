public class Exception4 {
    public static void main(String args[]){
        int a[]= {5,10};
        int b = 5;
        try{
            int x=a[1]/b-a[0]; // arithmetic error
            int y=a[2]/b-a[1]; // array index error
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index error");
        }
        catch(ArrayStoreException e){
            System.out.println("Array wrong data type");
        }
        int y = a[1]/a[0];
        System.out.println("y="+y);
    }
}
