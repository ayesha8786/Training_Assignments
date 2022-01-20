package collections;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import collections.Contact.gender;
public class Tree {

		public static void main(String[] args)
		{
			Map<Long,Contact> map=new TreeMap<Long,Contact>();
			Contact c1=new Contact((long)9852634,"john","john@gmail.com",gender.m);
			Contact c2=new Contact((long)4563218,"william","william@gmail.com",gender.m);
			Contact c3=new Contact((long)8541279,"Clarke","clarke@gmail.com",gender.m);
			Contact c4=new Contact((long)2365478,"Mike","mike@gmail.com",gender.m);
			map.put((long)9852634, c1);
			map.put((long)4563218, c2);
			map.put((long)8541279, c3);
			map.put((long)2365478, c4);
			 for(Map.Entry<Long, Contact> entry:map.entrySet()){  
				 Long key=entry.getKey();  
			        Contact c=entry.getValue();  
			        System.out.println(key+" Details:");  
			        System.out.println(c.phoneno+" "+c.name+" "+c.email+" "+c.g);  
			 }
			 System.out.println("............");
			 System.out.println("After Sorted:");
			        Map<Long,Contact> sortedMapDesc = new TreeMap<>(
			                Collections.reverseOrder());
			        sortedMapDesc.putAll(map);
			        for(Map.Entry<Long,Contact> entry1 : sortedMapDesc.entrySet())
			        {
			        	 Long key=entry1.getKey();  
					        Contact c8=entry1.getValue();  
					        System.out.println(key+" Details:");
			        System.out.println(c8.phoneno+" "+c8.name+" "+c8.email+" "+c8.g);  
			        }     
			    
		}
	}
