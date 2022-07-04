   /* 문제
    * 이모티콘 종류가 총 7가지가 있다.
    * 각각의 이모티콘이 특정 이벤트에서 랜덤하게 화면에 나타난다.
    * 이모티콘의 출현 확률이 다음과 같도록 이모티콘 생성기를 작성하라.
    * 
    * 동그라미 : 70%, 삼각형 : 50%, 사각형 : 30%, 오각형 : 5%, 육각형 : 1%, 팔각형 : 0.5%, 별 : 0.1%
    * hint : Math.random() 
    */

package com.varxyz.jv200.mod003;

public class RandomCheck {
	   public RandomCheck() {
	      String[] emoticon = new String[1566];
	      for(int i = 0; i < emoticon.length; i++) {
	         if(i < 700) {
	            emoticon[i] = "동그라미";
	         } else if (i >=700 && i < 1200) {
	            emoticon[i] = "삼각형";
	         } else if (i >= 1200 && i < 1500) {
	            emoticon[i] = "사각형";
	         } else if (i >= 1500 && i < 1550) {
	            emoticon[i] = "오각형";
	         } else if (i >= 1550 && i < 1560) {
	            emoticon[i] = "육각형";
	         } else if (i >= 1560 && i < 1565) {
	            emoticon[i] = "팔각형";
	         } else {
	            emoticon[i] = "별";
	         }
	      }
	      
	      double random = Math.random() * 1566;
	      System.out.println((int)random);
	      System.out.println(emoticon[(int) random]);
	   }
	}