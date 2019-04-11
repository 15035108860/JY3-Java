package com.nuedu.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	
	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<String, String>();
		
		map.put("tom", "18");
		map.put("Jack", "19");
		map.put("rose", "18");
		System.out.println(map);
		
		//��һ�ֱ�����ʽ
		Set<String> ks = map.keySet();
		
		Iterator<String> iterator = ks.iterator();
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			
			String value = map.get(key);
			
			
			System.out.println(key + "==" + value);
			
		}
		
		
		//
		Set<Entry<String, String>> kv = map.entrySet();
		Iterator<Entry<String, String>> iterator2 = kv.iterator();
		while(iterator2.hasNext()) {
			Entry<String, String> kv1 = iterator2.next();
			
			String key = kv1.getKey();
			String value = kv1.getValue();
			
			System.out.println(key+"=="+value);
		}
		
	}

}
