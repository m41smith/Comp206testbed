public class Main {
    public static void main(String[] args) {
        double A = 0;
        double B = 1;
        double C = 0;
//        System.out.println("fib");
//        while (A < 255){
//            C = A + B;
//            B = A;
//            A = C;
//            System.out.println(A);
//        }
//        A = 0;
//        B = 1;
//        C = 0;
        System.out.println("fib by add");
        while (A < 255){
            A = A + B;
            B = B + A;
            System.out.println(A);
            System.out.println(B);
        }
    }
}