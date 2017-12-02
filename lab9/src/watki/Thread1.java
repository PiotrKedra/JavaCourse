package watki;

import com.company.Value;

public class Thread1 extends Thread{

    public Value _value;

    public Thread1(Value _value) {
        this._value = _value;
    }

    public void run(){


            Value._vaule++;

    }
}
