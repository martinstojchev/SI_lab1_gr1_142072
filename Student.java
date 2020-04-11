class Student {
	String index;
	String firstName;
	String lastName;
	ArrayList<Integer> labPoints;

	//TODO constructor
	
	public Student(int index, String firstName, String lastName) {
		this.index = index;
		firstName = firstName;
		lastName = lastName;
	}

	//TODO seters & getters
	public int getIndex() {
		return index;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public ArrayList<Integer> getLabPoints() {
		return labPoints;
	}
	
	public void setIndex(int index) {
		this.index = index
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setSetLabPoints(ArrayList<Integer> labPoints) {
		this.labPoints = labPoints;
	}
	

	public double getAverage() {
		//TODO
		int sum = 0;
		
		for (int grade in labPoints) {
			sum += grade;
		}
		
		return sum / labPoints.size()
	}

	public boolean hasSignature() {
		//TODO
		if labPoints.size() > 8 {
			return true;
		}
		else {
			return false;
		}
	}
}
