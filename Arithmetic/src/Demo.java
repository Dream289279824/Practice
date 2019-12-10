public class Demo {

    public static void main(String[] args) {
        int x;
        int y = 1;
        boolean flag = true;
        while (flag){
            x = y;
            for (int i = 1; i < 10; i++){
                x = x - (x / 2 + 1);
            }
            if (x == 1){
                System.out.println(y);
                break;
            }
            y++;
        }


    }



}
