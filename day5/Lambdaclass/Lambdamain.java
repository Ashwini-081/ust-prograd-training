public class Lambdamain{
    public static void main(String[] args) {
        /* Aroperation a=()-> {
            System .out.println("Aishu");

        };
        a.bark();

            
        } */
        Aroperation addition = (int a,int b) -> {return(a+b);};
        System.out.println(addition.add(10,5));
        Aroperation substraction = (int a,int b) -> {return(a-b);};
        System.out.println(substraction.sub(10,5));
        Aroperation multiplication = (int a,int b) -> {return(a*b);};
        System.out.println(multiplication.mul(10,5));
        Aroperation division= (int a,int b) -> {return(a/b);};
        System.out.println(division.div(10,5)); 



    }
}

