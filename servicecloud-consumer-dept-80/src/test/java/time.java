import java.util.Date;

public class time {
    public static void main(String[] args){
        while (true){
            System.out.println(new Date().getTime());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
