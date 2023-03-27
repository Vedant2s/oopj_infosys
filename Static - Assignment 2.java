class Participant {
    //Implement your code here
    private static int counter=10001;
    private String registrationId,city,name;
    private long  contactNumber;
    public Participant(String name,long  contactNumber,String city){
    this.name=name;
    this.contactNumber=contactNumber;
    this.city=city;
    }
    public String getRegistrationId(){
    registrationId="D";
    registrationId=registrationId+counter++;
    return registrationId;
    }
    public String getName(){
    return name;
    }
    
}

class Tester {

	public static void main(String[] args) {
		
		Participant participant1 = new Participant("Franklin", 7656784323L, "Texas");
		Participant participant2 = new Participant("Merina", 7890423112L, "New York");
		
		//Create more objects and add them to the participants array for testing your code
		
		Participant[] participants = { participant1, participant2 };
		
		for (Participant participant : participants) {
			System.out.println("Hi "+participant.getName()+"! Your registration id is "+participant.getRegistrationId());
		}

	}
} 
