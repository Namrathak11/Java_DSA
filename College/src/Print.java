public class Print {
    public static void main(String[] args) {
        if(args.length>3){
            System.out.println("Enter valid Input");
            return;
        }
        double principal=Double.parseDouble(args[0]);
        double time=Double.parseDouble(args[1]);
        double rate=Double.parseDouble(args[2]);

        double SI=principal* time * rate/100;
        System.out.println("Simple Interest is:"+SI);
    }
}
