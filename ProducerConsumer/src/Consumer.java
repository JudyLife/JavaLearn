/**
 * Created by zongzhaoxiu on 2019/9/9.
 */
public class Consumer implements Runnable {

    Basket b ;

    Food f;

    public Consumer(Basket b)
    {
        this.b = b;
    }

    @Override
    public void run() {

        //System.out.println("进入消费模式");
        for (int i = 0; i < 20; i++) {
            f = new Food(i);
            try {
                b.pop(f);
                System.out.println("正在消费第"+i+"份食物");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
