package Comparing_Stream_with_loop;

public class count_occurrence {
    public static void main(String[] args){
        String str="Sajilaa";
        char c='a';

        long result=str.chars()
                .filter(ch->ch==c)
                .count();
        System.out.println(result);

    }
}
