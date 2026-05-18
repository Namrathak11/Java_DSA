import java.util.Arrays;
public class First {
    public static void main(String[] args){
        BASIC[] base=new BASIC[5];
        BASIC me=new BASIC();
        me.name="abhi";
        me.rollno=24;
        me.marks=8.9f;
        System.out.println(me);
    }
   static class BASIC{
        String name;
        int rollno;
        float marks;
    }
}
