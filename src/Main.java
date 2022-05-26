public class Main {
    public static void main(String[] args) {
        double A = 0;
        double B = 0;
        System.out.println("Pow");
        while(A < 255){
            A = Math.pow(2, B);
            B++;
            System.out.println(A);
        }
        System.out.println("Pow with add");
        double C = 1;
        while(C < 255){
            C = C + C;
            System.out.println(C);

        }
    }
}