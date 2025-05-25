package assignments_java;

public class MainDegree {
	public static void main(String[] args) {
		Degree d = new Degree();
		UnderGraduate u = new UnderGraduate();
		PostGraduate p = new PostGraduate();
		u.getDegree();
		d.getDegree();
		p.getDegree();
		System.out.println(" degree override run ");
		d = new UnderGraduate();
		d.getDegree();

		System.out.println("\n------ array in degree object ---- ");
		Degree degree[] = new Degree[3];
		degree[0] = new Degree();
		degree[1] = new PostGraduate();
		degree[2] = new UnderGraduate();
		
		for(int i=0; i<3; i++) {
			degree[i].getDegree();
		}
	}
}
