package hku.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectSample {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class rc = Class.forName("hku.reflect.Robot");
		Robot r = (Robot)rc.newInstance();
		System.out.println("Class name is "+rc.getName());
		Field[] fields = rc.getDeclaredFields();
		for(Field field: fields){
			System.out.println(field);
			if(field.getName() == "name")
			{	
				field.setAccessible(true);
				field.set(r, "Alice");
			}
		}
		Method getHello = rc.getDeclaredMethod("throwHello", String.class);
		getHello.setAccessible(true);
		Object str = getHello.invoke(r, "Bob");
		System.out.println("getHello result is "+str);
		r.sayHi("Welcome");
		System.out.println(System.getProperty("java.ext.dirs"));
	}
}
