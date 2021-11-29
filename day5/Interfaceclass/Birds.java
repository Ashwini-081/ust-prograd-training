public interface Birds {
    void name();
    void sound();
    default void show(){
        System.out.println("Defalt in interface");
    }
    static void display(){
        System.out.println("Static in interface ");
    }
}