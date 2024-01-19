

abstract class emp{

    String name;
    abstract void sayName();

    emp(String nam){ name = nam; }
}

class teacher extends emp{
    teacher(String nam){
        super(nam);
    }
    void sayName() {
        System.out.println("Hello students my name is "+name);
    }
}

class Staff extends emp{
    Staff(String nam){
        super(nam);
    }
    void sayName(){
        System.out.println("Hello myself "+name);
    }
}

public class AbstractDemo {
    public static void main(String args[]){

        teacher t1 = new teacher("pratik");
        t1.sayName();

        Staff st = new Staff("sohan");
        st.sayName();
    }
}
