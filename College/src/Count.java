public class Count {
    public static void main(String[] args) {
        if(args.length!=2){
            System.out.println("Enter valid input");
            return;
        }
        String word=args[0];
        String wordtocount=args[1];
        int count=0;

        String[] hel=word.split(" ");

        for(String wor:hel){
            if(wor.equalsIgnoreCase(wordtocount)) {
                count++;
            }
        }
        System.out.println(wordtocount+" appears "+count+" time(s)");
    }
}
