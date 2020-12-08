package com.mystudy.util;

import java.lang.reflect.Field;

public class RelectUtil {

    //将任意类型对象内容转换为json格式的字符串返回
    public static String jsonObject (Object obj) {
        Class classFile = null;
        Field fieldArr[] = null;
        StringBuffer sb = new StringBuffer("{");
        //1.获得当前对象隶属的【类文件】
        classFile = obj.getClass();
        //2.获得【class文件】所有【属性】
        fieldArr = classFile.getDeclaredFields();
        //3.获得当前对象中所有属性的值
        try {
            for (int i = 0;i < fieldArr.length;i++) {
                Field field = fieldArr[i];
                field.setAccessible(true);//确保私有访问权限属性可以在class文件外部使用
                String fName = field.getName();//获得属性名称
                Object val = field.get(obj);
                //4.将获得的属性及其值拼接为JSON格式字符串
                sb.append("\"");
                sb.append(fName);
                sb.append("\":\"");
                sb.append(val);
                sb.append("\"");
                if (i < fieldArr.length-1) {
                    sb.append(",");
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        sb.append("}");
        return sb.toString();
    }
}
