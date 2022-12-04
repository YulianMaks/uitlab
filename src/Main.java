public class Main {

    static int calc(int a, int b, String sign){

        switch(sign){
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
        }
        return  0;
    };

    public static void main(String[] args) {
        System.out.println(calc(10,5,"/"));
    }
}