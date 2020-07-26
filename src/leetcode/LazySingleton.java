package leetcode;

public class LazySingleton {
    private volatile static LazySingleton instance = null;

    //私有构造函数
    private LazySingleton() {
    }

    public static LazySingleton getInstance() {

        //第一重判断
        if (instance == null) {
            //锁定代码块
            synchronized (LazySingleton.class) {
                //第二重判断
                if (instance == null) {
                    //创建单例实例
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}

