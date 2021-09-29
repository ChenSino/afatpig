package com.chen.base.proxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * @author afatpig
 * @date 2021/9/29 上午10:42
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        //1. 创建一个代理对象，Proxy会自动返回一个代理类，此类是Excutor的子类
        Executor executor = (Executor) Proxy.newProxyInstance(Executor.class.getClassLoader(), new Class[]{Executor.class}, new LogTimeInvocationHandler(new ExecutorImpl()));
        //2. 把自动生成的代理对象打印到文件，方便查看分析
        Class<?> proxyClass = Proxy.getProxyClass(Executor.class.getClassLoader(), new Class[]{Executor.class});
        saveClass("$ExecutorProxy0", proxyClass.getInterfaces(), "/home/chenkun/Desktop/");
        //3. 使用代理对象调用
        int add = executor.add(1, 2);
    }

    /**
     * 生成代理类 class 并保持到文件中
     *
     * @param className  生成的代理类名称
     * @param interfaces 代理类需要实现的接口
     * @param pathdir    代理类保存的目录路径,以目录分隔符结尾
     */
    public static void saveClass(String className, Class<?>[] interfaces, String pathdir) {
        /**
         * 第一个参数是 代理类 名 。
         * 第二个参数是 代理类需要实现的接口
         */
        byte[] classFile = ProxyGenerator.generateProxyClass(className, interfaces);
        /**
         * 如果目录不存在就新建所有子目录
         */
        Path path1 = Paths.get(pathdir);
        if (!path1.toFile().exists()) {
            path1.toFile().mkdirs();
        }
        String path = pathdir + className + ".class";
        try (FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(classFile);
            fos.flush();
            System.out.println("代理类class文件写入成功");
        } catch (Exception e) {
            System.out.println("写文件错误");
        }
    }

    /**
     * 设置保存Java动态代理生成的类文件。
     *
     * @throws Exception
     */
    public static void saveGeneratedJdkProxyFiles() throws Exception {
        Field field = System.class.getDeclaredField("props");
        field.setAccessible(true);
        Properties props = (Properties) field.get(null);
        props.put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
    }
}
