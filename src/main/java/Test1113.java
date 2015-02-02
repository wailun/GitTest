import com.dianping.combiz.util.JsonUtils;
import com.wm.pj01.AA;
import org.apache.poi.poifs.crypt.HashAlgorithm;

import java.io.IOException;

/**
 * Created by wm on 14-11-13.
 */
public class Test1113 {

    public static void main(String[] args) throws IOException {
        String str="恭喜你,    抢到5元    红包1个";
        String []strings=str.split("\\s");
        System.out.println(JsonUtils.toStr(strings));

    }

    class TT extends Thread{
        public void run(){
//           t=new AA();
        }
    }

}
