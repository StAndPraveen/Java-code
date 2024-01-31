class animal{
    String name;
    static int count=0;
    animal(){ name="animal"; count++;}
    animal(String nam){ name=nam; count++;}

    static void sayCount(){
        System.out.println("the count of animal is :"+count);
    }
}

public class StaticMenber {
    public static void main(String args[]){
        
        animal a = new animal();
        animal s = new animal();
        animal f = new animal();
        animal d = new animal();

        a.sayCount();
    }
}
