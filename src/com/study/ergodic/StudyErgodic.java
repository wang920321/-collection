/**
 * 
 */
package com.study.ergodic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Administrator
 *
 */
public class StudyErgodic {
    
	/**
	 * @Title: StudyErgodic.java 
	 * @Package com.study.ergodic 
	 * @Description: TODO(用一句话描述该文件做什么) 
	 * @author kpwang   
	 * @date 2018年1月17日 下午1:20:53
	 * @param args
	 */
	public static void main(String[] args) {
		setTest();
		listTest();
		mapTest();
	}
	private static void setTest(){
		Set<String> set=new HashSet<String>();
		set.add("java");
		set.add("c");
		set.add("C++");
		set.add("java");
		set.add("JavaScript");
		System.out.println(set);
		//用迭代器遍历
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			String value=iterator.next();
			System.out.println(value);
		}
		//用增强for循环遍历
		for (String string : set) {
			System.out.println(string);
		}
		
	}
	private static void listTest(){
		List<String> list=new ArrayList<String>();
		list.add("java");
		list.add("c");
		list.add("C++");
		list.add("java");
		list.add("javasript");
		//使用迭代器遍历
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			String value=iterator.next();
			System.out.println(value);
		}
		//增强for循环
		for (String string : list) {
			System.out.println(string);
		}
		//一般for循环
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	private static void mapTest(){
		Map<String, String> map=new HashMap<String, String>();
		map.put("1", "java");
		map.put("2", "C");
		map.put("3", "C++");
		map.put("4", "javascript");
		System.out.println(map);
		Set<Entry<String, String>> entrySet = map.entrySet();
		//使用迭代器遍历
		Iterator<Entry<String, String>> iterator = entrySet.iterator();
		while(iterator.hasNext()){
			Entry<String, String> next = iterator.next();
			String key = next.getKey();
			String value = next.getValue();
			System.out.println(key+":"+value);
		}
		//增强for循环
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry);
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+":"+value);
		}
		//keySet
		Set<String> keySet = map.keySet();
		for (String string : keySet) {
			System.out.println(string);
			String value = map.get(string);
			System.out.println(value);
		}
	}

}
