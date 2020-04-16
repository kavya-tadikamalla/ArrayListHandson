package cf;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class ProjectUtils {
	public Map<Project,Employee> loadProjects() throws ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		Employee emp=new Employee(101,"kavya","kavya2397@gmail.com",23000.0);
		Employee emp1=new Employee(103,"vikas","vikas3001@gmail.com",24000.0);
		Project p1=new Project(201,"java",sdf.parse("23/03/2019"),sdf.parse("02/01/2020"));
		Project p2=new Project(202,"dotnet",sdf.parse("11/06/2019"),sdf.parse("03/06/2020"));
		Project p3=new Project(203,"sql",sdf.parse("11/06/2019"),sdf.parse("03/06/2020"));
		Project p4=new Project(204,"reactjs",sdf.parse("11/06/2019"),sdf.parse("03/06/2020"));
		Project p5=new Project(205,"frontend",sdf.parse("11/06/2019"),sdf.parse("03/06/2020"));
		Project p6=new Project(206,"devops",sdf.parse("11/06/2019"),sdf.parse("03/06/2020"));
		Project p7=new Project(207,"informata",sdf.parse("11/06/2019"),sdf.parse("03/06/2020"));
		Project p8=new Project(208,"python",sdf.parse("11/06/2019"),sdf.parse("03/06/2020"));
		Project p9=new Project(209,"testing",sdf.parse("11/06/2019"),sdf.parse("03/06/2020"));
		Project p10=new Project(210,"sap",sdf.parse("11/06/2019"),sdf.parse("03/06/2020"));
		Map<Project,Employee> map=new HashMap<Project, Employee>();
		map.put(p1, emp1);
		map.put(p2,emp);
		map.put(p9, emp);
		map.put(p6, emp1);
		map.put(p5, emp1);
		map.put(p3, emp);
		map.put(p7, emp);
		map.put(p4, emp1);
		map.put(p10, emp1);
		map.put(p8, emp);
				return map;
		
	}
	public void displayByProjectId(Map<Project,Employee> map) {
		
		TreeMap<Project, Employee> tmap=new TreeMap<Project,Employee>(map);
		tmap.entrySet().stream().forEach(t->System.out.println(t));
	}
	public void displayByProjectDomain(Map<Project,Employee> map) {
	
		Set<Map.Entry<Project, Employee>> entryset=map.entrySet();
		Comparator<Map.Entry<Project, Employee>> projectcmp=new Comparator<Map.Entry<Project,Employee>>() {
			
			@Override
			public int compare(Entry<Project, Employee> o1, Entry<Project, Employee> o2) 
			{
				
				return o1.getKey().getDomain().compareTo(o2.getKey().getDomain());
			}
		};
		
		entryset.stream().sorted(projectcmp).forEach(t->System.out.println(t));;
	}
	

}
