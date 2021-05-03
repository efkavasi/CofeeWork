package coffeeDemo.Entities;

public class Customer {

		private int id;
		private String FirstName;
		private String LastName;
		private int BirthDate;
		private String NationalId;
		
		public Customer() {
			
		}
		
		public Customer(int id, String FirstName, String lastName, int BirthDate, String nationalId) {
			this.id = id;
			this.FirstName = FirstName;
			this.LastName = lastName;
			this.BirthDate = BirthDate;
			this.NationalId = nationalId;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return FirstName;
		}

		public void setFirstName(String firstName) {
			FirstName = firstName;
		}

		public String getLastName() {
			return LastName;
		}

		public void setLastName(String lastName) {
			LastName = lastName;
		}

		public int getBirthDate() {
			return BirthDate;
		}

		public void setBirthDate(int  birthDate) {
			BirthDate = birthDate;
		}

		public String getNationalId() {
			return NationalId;
		}

		public void setNationalId(String nationalId) {
			NationalId = nationalId;
		}
		
}
