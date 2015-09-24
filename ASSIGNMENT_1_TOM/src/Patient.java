
public class Patient
{
	//INSTANCE VARIABLES++++++++++++++++++++++++
	private int patientId;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String province;
	private String postalCode;
	
	//PROPERTIES+++++++++++++++++++++++++++++++
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	//CONSTRUCTORS++++++++++++++++++++++++++++++++++
	public Patient ()
	{
	
	}
	public Patient (int PatientId,String FirstName,String LastName, String Address,String City,String Province, String PostalCode )
	{
		this.patientId = PatientId;
		this.firstName = FirstName;
		this.lastName = LastName;
		this.address = Address;
		this.city = City;
		this.province = Province;
		this.postalCode = PostalCode;
	}
	//METHOD+++++++++++++++++++++++++++++++++++++++++
	public void getPatientInfo (int PatientId, String FirstName, String LastName, String Address, String City, String Province, String PostalCode)
	{
	       System.out.printf( "The Result for your data entry is: "+ "%n Patient ID:" + PatientId +"%n First Name:" + FirstName + "%n Last Name:"+LastName+ "%n Address:"+Address+ "%n City: "+City+ "%n Province: "+Province+ "%n PostalCode: "+PostalCode);
	}
	
	

	

	

}
