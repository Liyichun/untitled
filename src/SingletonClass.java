/**
 * Created by yichunli on 2017/7/4.
 *
 */
public class SingletonClass {
    /**
     * 饿汉式单例
     */
    private static final SingletonClass instance = new SingletonClass();
    //私有构造函数
    private SingletonClass(){}
    public static SingletonClass getInstance(){
        return instance;
    }

    /**
     * 懒汉式单例
     */
    private static SingletonClass instance2 = null;
    //私有构造函数
    //private SingletonClass(){}
    public synchronized static SingletonClass getInstance2(){
        if(instance2 == null){
            instance2 = new SingletonClass();
        }
        return instance2;
    }
}
