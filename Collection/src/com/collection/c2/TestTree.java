
package com.collection.c2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestTree {
	public static void main(String[] args) {
		Set ts=new TreeSet();
		String s1="AA";
		String s2="BBB";
		String s3="CCCC";
		String s4="DDDDD";
		String s5="CEEEEE";
		String s6="FFFFFFF";
		String s7="AGGGGGGG";
		String s8="FHHHHHHHH";
		String s9="DIIIIIIIII";
		String s10="BJJJJJJJJJJ";
		ts.add(s1);
		ts.add(s2);
		ts.add(s4);
		ts.add(s8);
		ts.add(s6);
		ts.add(s9);
		ts.add(s7);
		ts.add(s3);
		ts.add(s10);
		ts.add(s5);
		System.out.println("ts="+ts);
		System.out.println("....using comparator....");
		StringLengthComparator slc=new StringLengthComparator();
		Set tsc=new TreeSet(slc );
		String s11="AA";
		String s12="BBB";
		String s13="CCCC";
		String s14="DDDDD";
		String s15="CEEEEE";
		String s16="FFFFFFF";
		String s17="AGGGGGGG";
		String s18="FHHHHHHHH";
		String s19="DIIIIIIIII";
		String s20="BJJJJJJJJJJ";
		tsc.add(s11);
		tsc.add(s12);
		tsc.add(s14);
		tsc.add(s18);
		tsc.add(s16);
		tsc.add(s19);
		tsc.add(s17);
		tsc.add(s13);
		tsc.add(s20);
		tsc.add(s15);
		System.out.println("tsc="+tsc);
		
		List l= new ArrayList();
		String s21="AA";
		String s22="BBB";
		String s23="CCCC";
		String s24="DDDDD";
		String s25="CEEEEE";
		String s26="FFFFFFF";
		String s27="AGGGGGGG";
		String s28="FHHHHHHHH";
		String s29="DIIIIIIIII";
		String s30="BJJJJJJJJJJ";
		l.add(s21);
		l.add(s22);
		l.add(s24);
		l.add(s28);
		l.add(s26);
		l.add(s29);
		l.add(s27);
		l.add(s23);
		l.add(s30);
		l.add(s25);
		System.out.println("....using Collections.sort(list ref).....");
		Collections.sort(l);
		System.out.println("Based on natural ordering"+l);
		System.out.println("....using Collections.sort(l,slc).....");
		Collections.sort(l,slc);
		System.out.println("Based on length "+l);
	}
}
