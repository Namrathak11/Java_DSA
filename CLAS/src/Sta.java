
class Test{
    static String name;
    public  Test(String name){
        Test.name=name;
    }
}

public class Sta {
    public static void main(String[] args) {


        Test a = new Test("K");
        Test b = new Test("D");

        System.out.println(a.name);
        System.out.println(a.name);
    }

}
