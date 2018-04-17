package com;

import java.lang.reflect.Method;

public class Hello {
    public static void main(String[] args) {
        String className = args[0];
        String functionName = args[1];
        //System.out.print(className + " " + functionName);
        try {
            Class talkClass = Class.forName("com.zhouzhengxi." + className);
            Object obj = talkClass.newInstance();
            Method[] methods = talkClass.getMethods();
            for (Method method : methods) {
                if (functionName.equals(method.getName())) {
                    String result = (String)method.invoke(obj, "I am back.");
                    System.out.printf(result);
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
