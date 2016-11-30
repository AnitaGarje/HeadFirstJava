/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PhraseOMatic;

/**
 *
 * @author Annu
 */

public class PhraseOMatic{
 public static void main(String[] arg)
	{
	String[] wordLsitOne={"Chemu" ,"Lulu","Daduts","Chimbuda",
		"NewYork","India","Australia"};
	String[] wordLsittwo={"Chemu2" ,"Lulu2","Daduts2","Chimbuda2",
		"NewYork2","India2","Australia2"};

	String[] wordLsitthree={"Chemu3" ,"Lulu3","Daduts3","Chimbuda3",
		"NewYork3","India3","Australia3"};

	int len1=wordLsitOne.length;
	int len2=wordLsittwo.length;
	int len3=wordLsitthree.length;

	int random1=(int)(Math.random()*len1);
	int random2=(int)(Math.random()*len2);
	int random3=(int)(Math.random()*len3);

String phrase=wordLsitOne[random1]+" "+wordLsittwo[random2]+" "+wordLsitthree[random3];
System.out.println("Our phrase is:"+phrase);
	}
}
