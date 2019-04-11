package com.nuedu.doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Poker {
	/**
	 * 斗地主发牌排序
	 * @param args
	 */
	public static void main(String[] args) {
		
		//准备花色
		ArrayList<String> colocr = new ArrayList<String>();
		colocr.add("♠");
		colocr.add("♥");
		colocr.add("♦");
		colocr.add("♣");

		//准备数字
		ArrayList<String> number = new ArrayList<String>();
		
		Collections.addAll(number,"3","4","5","6","7","8","9","10","J","Q","K","A","2");
		
		//map集合中存放索引与对应的牌
		HashMap<Integer,String> map = new HashMap<Integer, String>();
		
		int index = 0;
		for (String thisNumber : number) {
			
			for (String thisColocr : colocr) {
				
				map.put(index++, thisNumber+thisColocr);
			}
		}
		
		//加入大小王
		map.put(index++, "小☺");
		map.put(index++, "大☻");
		//System.out.println(map);
		//将53张牌存到集合中(存放牌对应的索引)为了取牌
		ArrayList<Integer> cards = new ArrayList<Integer>();
		
		for(int i = 0; i <= 53; i ++) {
			
			cards.add(i);
		}
		
		//洗牌
		Collections.shuffle(cards);
		
		//创建三个玩家跟底牌
		ArrayList<Integer> player1 = new ArrayList<Integer>();
		ArrayList<Integer> player2 = new ArrayList<Integer>();
		ArrayList<Integer> player3 = new ArrayList<Integer>();
		ArrayList<Integer> itCards = new ArrayList<Integer>();
		
		//循环遍历发牌
		for(int i = 0; i < cards.size(); i++) {
			
			if(i >= 51) {
				itCards.add(cards.get(i));
				
			}else {
				if(i%3 == 0) {
					
					player1.add(cards.get(i));
					
				}else if(i%3 == 1) {
					
					player2.add(cards.get(i));
					
				}else {
					
					player3.add(cards.get(i));
				}
			}
		}
		
		//排序手中的牌
		Collections.sort(player1);
		Collections.sort(player2);
		Collections.sort(player3);
		Collections.sort(itCards);
		
		//根据每个人手中的数字找出相应的牌
		ArrayList<String> splayer1 = new ArrayList<String>();
		ArrayList<String> splayer2 = new ArrayList<String>();
		ArrayList<String> splayer3 = new ArrayList<String>();
		ArrayList<String> sitCards = new ArrayList<String>();
		
		for (int key : player1) {
			
			splayer1.add(map.get(key));
		}
		
		for (int key : player2) {
			
			splayer2.add(map.get(key));
		}
		
		for (int key : player3) {
	
			splayer3.add(map.get(key));
		}
		for (int key : itCards) {
	
			sitCards.add(map.get(key));
		}
		
		System.out.println("玩家1的牌:  "+splayer1);
		System.out.println("玩家2的牌:  "+splayer2);
		System.out.println("玩家3的牌:  "+splayer3);
		System.out.println("底          牌:  "+sitCards);
		
	}
}
