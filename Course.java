class Course {
	ArrayList<Student> students;

	//TODO constructor
	
	public Course(ArrayList students) {
		this.students = students;
	}

	//TODO seters & getters
	public ArrayList getStudents() {
		return students;
	}
	
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	

	public int getNumberOfStudents() {
		return students.size();
	}
}
