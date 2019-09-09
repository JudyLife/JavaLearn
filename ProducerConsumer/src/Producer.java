/**
 * Created by zongzhaoxiu on 2019/9/9.
 */
public class Producer implements Runnable{

    Basket b ;

    Food f;

    public Producer(Basket b)
    {
        this.b = b;
    }

    @Override
    public void run() {

        for (int i = 0; i < 20; i++) {
            f = new Food(i);
            try {
                b.push(f);
                System.out.println("正在生产第"+i+"份食物");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
