package flyweight.demo;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
	
	Map<String, IRobot> shapes = new HashMap<String, IRobot>();
	public int TotalObjectsCreated() {
		return shapes.size();
	}
	
	public IRobot GetRobotFromFactory(String cate) throws Exception {
		IRobot r_c = null;
		if (this.shapes.containsKey(cate)) {
			r_c = this.shapes.get(cate);
		} else {
			switch(cate) {
			case "small":
				r_c = new SmallRobot();
				this.shapes.put("small", r_c);
				break;
			case "large":
				r_c = new LargeRobot();
				this.shapes.put("large", r_c);
				break;
			default:
				throw new Exception("cannot create");
			}
		}
		return r_c;
	}

}
