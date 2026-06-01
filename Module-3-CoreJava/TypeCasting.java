public class TypeCasting {
    public static void main(String[] args) {
        double db=9.78;
        
        int intDb=(int) db; 
        System.out.println("Double value: "+db);
        System.out.println("Casted to int: "+intDb);

        int myInt=5;
        double dbInt=myInt; 
        System.out.println("Int value: "+dbInt);
        System.out.println("Casted to double: "+dbInt);
    }
}