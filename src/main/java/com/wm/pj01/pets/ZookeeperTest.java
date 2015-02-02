package com.wm.pj01.pets;

import org.apache.zookeeper.*;

import java.io.IOException;

/**
 * Created by wm on 14-11-1.
 */
public class ZookeeperTest {
    public static void main(String[] args) throws KeeperException, InterruptedException, IOException {
        // 创建一个与服务器的连接
        ZooKeeper zk = new ZooKeeper("127.0.0.1:2181", 500000,new Watcher() {
            // 监控所有被触发的事件
            public void process(WatchedEvent event) {
                //dosomething
                System.out.println(event);
            }
        });
//创建一个节点root，数据是mydata,不进行ACL权限控制，节点为永久性的(即客户端shutdown了也不会消失)
        zk.create("/root", "mydata".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);

//在root下面创建一个childone znode,数据为childone,不进行ACL权限控制，节点为永久性的
        zk.create("/root/childone","childone".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE,CreateMode.PERSISTENT);

//取得/root节点下的子节点名称,返回List<String>
        zk.getChildren("/root",true);

//取得/root/childone节点下的数据,返回byte[]
        zk.getData("/root/childone", true, null);

//修改节点/root/childone下的数据，第三个参数为版本，如果是-1，那会无视被修改的数据版本，直接改掉
        zk.setData("/root/childone","childonemodify".getBytes(), -1);

//删除/root/childone这个节点，第二个参数为版本，－1的话直接删除，无视版本
        zk.delete("/root/childone", -1);

//关闭session
        zk.close();
    }
}
