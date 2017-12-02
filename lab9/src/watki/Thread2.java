package watki;

import com.company.Value;

public class Thread2 extends Thread{
    public Value value;
    public Thread2(Value value){
        this.value = value;
    }
    public void run(){

            Value._vaule+=2;
            /*try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/

            System.out.println(Value._vaule);

    }
}
