package cf;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapsMain {

	public static void main(String[] args) throws ParseException {
		/*SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		Employee emp=new Employee(101,"kavya","kavya2397@gmail.com",23000.0);
		Employee emp1=new Employee(103,"vikas","vikas3001@gmail.com",24000.0);
		Project p1=new Project(201,"java",sdf.parse("23/03/2019"),sdf.parse("02/01/2020"));
		Project p2=new Project(202,".net",sdf.parse("11/06/2019"),sdf.parse("03/06/2020"));
		Map<Project,Employee> map=new HashMap<Project, Employee>();
		map.put(p2,emp);
		map.put(p1, emp1);*/
		ProjectUtils projutils=new ProjectUtils();
		Map<Project,Employee> emap=projutils.loadProjects();
		System.out.println("Before Sorting");
		Set<Map.Entry<Project,Employee>> entry=emap.entrySet();
		Iterator<Map.Entry<Project,Employee>> itr=entry.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("After Sorting by Id");
		projutils.displayByProjectId(emap);
		System.out.println("After Sorting by Domain");
		projutils.displayByProjectDomain(emap);
	}

}
