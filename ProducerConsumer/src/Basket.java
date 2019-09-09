import java.util.ArrayList;

/**
 * Created by zongzhaoxiu on 2019/9/9.
 */
public class Basket {

    ArrayList<Food> ff = new ArrayList<Food>();

    //int index =0;

    public Basket()
    {

    }

    public synchronized void push(Food f) throws InterruptedException {
        while(ff.size()==10)
        {
            this.wait();
        }

        this.notify();
        ff.add(f);

    }

    public synchronized void pop(Food f) throws InterruptedException {

        while (ff.size()==0)
        {
            this.wait();
        }
        this.notify();
        ff.remove(f);

    }

}
