import java.util.*;

public class Person {
    /*
    Write a Person class with an instance variable, age, and a constructor that takes an integer, initialAge, as a parameter. 
    The constructor must assign initialAge to age after confirming the argument passed as  is not negative; 
    if a negative argument is passed as initialAge, the constructor should set age to 0 and print Age is not valid, setting age to 0.. 
    In addition, you must write the following instance methods:

    1.yearPasses() should increase the age instance variable by 1.
    2.amIOld() should perform the following conditional actions:
        if age < 13, print You are young.
        if age >= 13 and age < 18, print You are a teenager..
        Otherwise, print You are old..
    */
    private int age;	
  
	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
        this.age = initialAge;
        if ( this.age < 0) {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        this.age = initialAge;
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
          String correct;
        if( (this.age < 13) ){
                correct = "You are young.";
        }else if(this.age >= 13 && this.age < 18){
                correct = "You are a teenager.";
        }else{
                correct = "You are old.";
        }
        System.out.println(correct);
	}

	public void yearPasses() {
  		// Increment this person's age.
          this.age += 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}
