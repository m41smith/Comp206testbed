public class Main {
    public static void main(String[] args) {
        double A = 0;
        double B = 0;
        while(A < 255){
            A = Math.pow(2, B);
            B++;
            System.out.println(A);
        }
    }
}