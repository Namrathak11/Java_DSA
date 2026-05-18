public class Th {
    public static void main(String[] args){
        BEGIN[] seb=new BEGIN[5];
        BEGIN ret=new BEGIN();
        BEGIN look=new BEGIN("movie","game");
        System.out.println(look);
        System.out.println(ret);
    }
    static class BEGIN{
        int rollno;
        String name;
        String name1;
        float marks;

        BEGIN(){
            this.rollno=34;
            this.name="DARSHAN";
            this.marks=100;
        }
        BEGIN(String film,String vg){
            this.name="KGF";
            this.name1="KGF2";
        }

       public String toString() {
           if (name1 == null) {
               return "Rollno :" + rollno + " " + "name: " + name + " " + " marks: " + marks;
           } else {
               return "Your favorite movie is: " + name + " " + "Your favorite sequel is: " + name1;
           }
       }

    }
}
