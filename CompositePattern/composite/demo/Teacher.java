package composite.demo;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ITeacher {
	
	private String name;
	private String deptName;
	private List<ITeacher> controls;
	
	Teacher(String name, String deptName) {
		this.name = name;
		this.deptName = deptName;
		this.controls = new ArrayList<ITeacher>();
	}
	
	public void Add(Teacher teacher) {
		this.controls.add(teacher);
	}
	public void Remove(Teacher teacher) {
		this.controls.remove(teacher);
	}
	public List<ITeacher> getControllingDepts() {
		return this.controls;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return (this.name + " is the " + this.deptName);
	}

}
