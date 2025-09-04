package java_8_versions_Learning.lamda;

//interface sum {
//    int  Sum(int a, int b);
//}
//public class return_sum {
//    public static void main(String[] args)
//    {
//        sum result=(a,b)->a+b;
//
//    int res = result. add(15, 25);
//        System.out.println("Sum: " + res);
//
//    }

interface Sum {
    int sum(int a, int b);
}
    public class return_sum {
        public static void main(String[] args)
        {
           Sum  result=(a,b)->a+b;

            int res = result. sum(15, 25);
            System.out.println("Sum: " + res);

        }
}
