public class Len {
    String name;
    int age;
    float limit;

    public Len() {
        this.name = "notnull";
        this.age = 444;
    }

    public Len(String hesru, char s) {
        this.name = hesru;
        this.age = s;
    }

    public Len(String naam, int baba, float less) {
        this.name = "Krishna";
        this.age = 0;
        this.limit = 3.14f;
    }

    public static void main(String[] args) {
        Len obj = new Len();
        Len obj2 = new Len("Darshan", 'K');
        Len obj3 = new Len("nodo", 48, 4.4f);

        System.out.println(obj.name + "  " + obj.age);
        System.out.println(obj2.name + obj2.age);
        System.out.println(obj3.name + " " + obj3.age + " " + obj3.limit);


    }
}

