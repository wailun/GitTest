import com.dianping.combiz.util.JsonUtils;


import java.io.IOException;
import java.util.Calendar;

/**
 * Created by wm on 14-11-13.
 */
public class Test1113 {

    public static void main(String[] args) throws IOException {
        String str="恭喜你,    抢到5元    红包1个";
        String []strings=str.split("\\s");
        System.out.println(JsonUtils.toStr(strings));
        System.out.println(Calendar.getInstance().getTime());

    }

    class TT extends Thread{
        public void run(){
//           t=new AA();
        }
    }

}
