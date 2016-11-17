package com.keytop.kt_android_point;


import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 反射机制测试
 * Created by fengwenhua on 2016/11/17.
 */

public class ReflectionTest {

    public interface Phone{
        String androidVersion = null;
    }

    public class XiaoMiPhone implements Phone{
        private String phoneName;

        public String getPhoneName() {
            return phoneName;
        }

        public void setPhoneName(String phoneName) {
            this.phoneName = phoneName;
        }
    }

    public class GeliPhone implements Phone{
        private String phoneName;

        public GeliPhone(String phoneName){
            this.phoneName = phoneName;
        }

        public String getPhoneName() {
            return phoneName;
        }

        public void setPhoneName(String phoneName) {
            this.phoneName = phoneName;
        }

        public void helloWorld(){
            System.out.println("董明珠说开机界面必须是自己才显得有诚意");
        }
    }

    @Test
    public void Reflection() throws Exception {
//        Constructor<GeliPhone> constructor = GeliPhone.class.getConstructor(String.class);
//        GeliPhone phone = constructor.newInstance("格力2代");
//        phone.helloWorld();
        Class clazz = GeliPhone.class;
        System.out.println("getSimpleName >>>"+clazz.getSimpleName());
        System.out.println("getCanonicalName >>>"+clazz.getCanonicalName());
        System.out.println("getName >>>"+clazz.getName());
        System.out.println("getAnnotations >>>"+ Arrays.toString(clazz.getAnnotations()));
        System.out.println("getConstructors >>>"+ Arrays.toString(clazz.getConstructors()));
        System.out.println("getDeclaredClasses >>>"+ Arrays.toString(clazz.getDeclaredClasses()));
        System.out.println("getDeclaredConstructors >>>"+ Arrays.toString(clazz.getDeclaredConstructors()));
        System.out.println("getDeclaredFields >>>"+ Arrays.toString(clazz.getDeclaredFields()));
        System.out.println("getFields >>>"+ Arrays.toString(clazz.getFields()));
        System.out.println("getMethods >>>"+ Arrays.toString(clazz.getMethods()));
        Method method = clazz.getMethod("helloWorld",null);
        method.invoke(clazz.newInstance(),null);


    }

}
