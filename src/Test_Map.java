

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 * ��ϰMap
 * "sdfgzxcvasdfxcvdf"��ȡ���ַ����е���ĸ���ֵĴ�����
 * ϣ����ӡ�����a(1)c(2).....
 * 
 * �������£�
 * 1�����ַ���ת�����ַ����顣��ΪҪ��ÿһ����ĸ���в�����
 * 2������һ��map���ϣ���Ϊ��ӡ�������ĸ��˳������ʹ��treemap���ϡ�
 * 3�������ַ����顣
               ��ÿһ����ĸ��Ϊ��ȥ��map���ϡ�
	   �������null��������ĸ��1���뵽map�����С�
	   ������ز���null��˵������ĸ��map�����Ѿ����ڲ��ж�Ӧ������
	   ��ô�ͻ�ȡ�ô�����������������Ȼ�󽫸���ĸ��������Ĵ������뵽map�����С����ǵ���ԭ�������Ӧ��ֵ��
 * 4����map�����е����ݱ��ָ�����ַ�����ʽ���ء�
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
		
		//��һ��ȡ����ʽ
		Set<Character> st=tm.keySet();
		Iterator<Character> it=st.iterator();
		
		while(it.hasNext())
		{
			Character c=it.next();
			Integer in=tm.get(c);
			System.out.println(c+"("+in+")");
		}
		
		//�ڶ���ȡ����ʽ
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
