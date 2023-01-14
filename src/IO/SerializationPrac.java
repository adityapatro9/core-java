package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int id;
	String name;
	transient String kk;
	public Student(int id, String name,String kk) {
		super();
		this.id = id;
		this.name = name;
		this.kk=kk;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", kk=" + kk + "]";
	}

	

}

// if the parent is serializable then the child is also serializable

// in order to serialize that class should be serializable i.e, it is a marker 
// that is it indicates some meaning to the java compiler

public class SerializationPrac{
	/**
	 * The serialization process at runtime associates an id with each Serializable 
	 * class which is known as SerialVersionUID. It is used to verify the sender and receiver 
	 * of the serialized object
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		try{      
			Student s1 =new Student(2112,"Aradhya","The last AirBendder");
			FileOutputStream fout=new FileOutputStream("foxwagon.txt");    
			ObjectOutputStream out=new ObjectOutputStream(fout); 
			out.writeObject(s1);    
			out.flush();
			out.close();    
			System.out.println("success");    
		}catch(Exception e){System.out.println(e);} 

		try{ 
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("foxwagon.txt"));  
			Student s=(Student)in.readObject(); 
			System.out.println(s.id+" "+s.name);   
			System.out.println(s);// kk is null cause it is transient that is it is not converted into serialized state
			in.close();  
		}catch(Exception e){System.out.println(e);}
	}
}
