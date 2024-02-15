public class Final {
    public static void main(String args[]){
        try{
            System.out.println("Inside try block");
            throw new RuntimeException("demo");
        }
        finally{
            System.out.println("Exception handaler");
        }
    }
}
