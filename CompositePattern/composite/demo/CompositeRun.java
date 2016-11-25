package composite.demo;

import java.util.List;

public class CompositeRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teacher p = new Teacher("Som", "Principal");
		Teacher h = new Teacher("Das", "Hod-Math");
		Teacher hod = new Teacher("V", "Hod-Com");
		Teacher math1 = new Teacher("m1", "MT");
		Teacher math2 = new Teacher("m2", "MT");
		
		Teacher c1 = new Teacher("c1", "CT");
		Teacher c2 = new Teacher("c2", "CT");
		Teacher c3 = new Teacher("c3", "CT");
		
		p.Add(h);
		p.Add(hod);
		
		h.Add(math1);
		h.Add(math2);
		
		hod.Add(c1);
		hod.Add(c2);
		hod.Add(c3);
		
		math1.Add(null);
		math2.Add(null);
		
		c1.Add(null);
		c2.Add(null);
		c3.Add(null);
		
		System.out.println(p.getDetails());
		List<ITeacher> hods = p.getControllingDepts();
		for(int i = 0;i < hods.size(); i++) {
			System.out.println("\t" + hods.get(i).getDetails());
		}
		hods = h.getControllingDepts();
		for(int i = 0;i < hods.size(); i++) {
			System.out.println("\t" + hods.get(i).getDetails());
		}
		hods = hod.getControllingDepts();
		for(int i = 0;i < hods.size(); i++) {
			System.out.println("\t" + hods.get(i).getDetails());
		}

	}

}
