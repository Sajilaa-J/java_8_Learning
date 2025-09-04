package java_8_versions_Learning.lamda;

public class anonymous_inner {
    public static void main(String[] args)
    {
    new Thread(()-> System.out.println("tasking is running")).start();
    }
}
