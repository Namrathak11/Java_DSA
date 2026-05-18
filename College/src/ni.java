public class ni {
    public static void main(String[] args){
        if(args.length!=2){
            System.out.println("Enter valid input:");
        }
        String words= args[0];
        String wordtosearch=args[1];
        int count=0;

        String[] hell=words.split(" ");

        for(String wor:hell){
            if(wor.equalsIgnoreCase(wordtosearch)){
                count++;
            }
        }
        System.out.println(wordtosearch+" appears "+count+" time(s)");


    }

}
