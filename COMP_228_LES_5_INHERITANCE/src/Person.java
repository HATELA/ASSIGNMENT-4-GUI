//SUPERCLASS++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
public class Person {
    //PRIVATE INSTANCE VARIABLES
	private int _age;
	private String _name;
	private float _height;
	private float _weight;
	
	//CONSTRUCTORS+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    Person(String name,int age,float height,float weight)
	{
		this._name = name;
		this._age = age;
		this._height = height;
		this._weight= weight;
	}
    //PUBLIC METHOD+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public void eat()
    {
    	System.out.println(this._name+"is eating");
    }
    public void walk()
    {
    	System.out.println(this._name+"is walking");
    }
    public void talk()
    {
    	System.out.println(this._name+"is talking");
    }
}
