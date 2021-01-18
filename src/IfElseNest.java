public class IfElseNest {
    public static void main(String[] args) {
        int a = 10;
        int b = 99;
        int c = 99;

        if(a== b && b ==c) {
            System.out.println("a,b,c等大，大小为"+ a);
        } else {
            if(a>b){
                if (b>c){
                    System.out.println("a是最大的值，为" +a);
                }
            }
        }
    }
}
