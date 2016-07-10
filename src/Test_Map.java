

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 * 练习Map
 * "sdfgzxcvasdfxcvdf"获取该字符串中的字母出现的次数。
 * 希望打印结果：a(1)c(2).....
 * 
 * 分析如下：
 * 1、将字符串转换成字符数组。因为要对每一个字母进行操作。
 * 2、定义一个map集合，因为打印结果的字母有顺序，所以使用treemap集合。
 * 3，遍历字符数组。
               将每一个字母作为键去查map集合。
	   如果返回null，将该字母和1存入到map集合中。
	   如果返回不是null，说明该字母在map集合已经存在并有对应次数。
	   那么就获取该次数并进行自增。，然后将该字母和自增后的次数存入到map集合中。覆盖调用原理键所对应的值。
 * 4、将map集合中的数据变成指定的字符串形式返回。
 * 
 */
public class Test_Map {

	public static void main(String[] args) {
		
		String as="aasankcsklikcnncdcasakdnddd";
		getnum(as);
		
	}
	
	public static void getnum(String s){
		
		
		char[] a=s.toCharArray();
		
		TreeMap<Character,Integer> tm=new TreeMap<Character,Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			Integer values=tm.get(a[i]);
			
			if(values==null)
			{
				tm.put(a[i], 1);
			}else
			{
				values++;
				tm.put(a[i], values);
			}
		}
		
		System.out.println(tm);
		
		//第一种取出方式
		Set<Character> st=tm.keySet();
		Iterator<Character> it=st.iterator();
		
		while(it.hasNext())
		{
			Character c=it.next();
			Integer in=tm.get(c);
			System.out.println(c+"("+in+")");
		}
		
		//第二种取出方式
		Set<Map.Entry<Character, Integer>>	es=tm.entrySet();
		Iterator<Map.Entry<Character, Integer>> its=es.iterator();
		
		while(its.hasNext())
		{
			Entry<Character,Integer>me=its.next();
			
			Character c=me.getKey();
			Integer in=me.getValue();
			
			System.out.print(c+"("+in+")"+"  ");
		}
		
		
	}

}
