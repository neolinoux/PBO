package javaio;
import java.io.*;
// Helper class implementing Serializable interface
class Student implements Serializable {
    // Private class member variables
    private static final long serialVersionUID = -1438960132000208485L;
    private String name;
    private int age;

    public Student(String name, int age){ 
        this.name = name;
        this.age = age;
    }
    // Getters and Setter for class
    public String getName() { return name; } 
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    // Override toString method
    @Override public String toString(){
        // Simply return the name and age
        return "Student [name=" + name + ", age=" + age	+ "]";
    }
}

public class ObjectInputOutputStream {
    public static void main(String[] args) throws FileNotFoundException, 
            IOException, ClassNotFoundException {      
        // Write student object to a file "objekFile.txt"
        FileOutputStream fileOutputStream = new FileOutputStream("build/classes/javaio/objekFile.txt");
        ObjectOutputStream objectOutput = null;         
        try {
            objectOutput = new ObjectOutputStream(fileOutputStream);
            // create object student
            Student dono = new Student("Dono",20);
            Student suketi = new Student("Suketi",55);
            Student kasino = new Student("Kasino",44);
            // write obj to File
            objectOutput.writeObject(dono);
            objectOutput.writeObject(suketi);
            objectOutput.writeObject(kasino);
        } finally {
            if (objectOutput != null || fileOutputStream != null ) { 
                objectOutput.close();
                fileOutputStream.close();
            }
        }
        ObjectInputOutputStream objectInputStreamDemo = new ObjectInputOutputStream();
        // Readfile function call
        objectInputStreamDemo.readStudentObject();
    }

    // Member method of main class
    private void readStudentObject() throws IOException, FileNotFoundException,
        ClassNotFoundException {
        
            InputStream fileInputStream = null;
            ObjectInputStream objectInputStream = null;
            try {
                fileInputStream = 
                        new FileInputStream("build/classes/javaio/objekFile.txt");
                objectInputStream = new ObjectInputStream(fileInputStream);
                Student student = null;
                while ((student = (Student)objectInputStream.readObject()) != null) { 
                    System.out.println("Successfully read student object from the file.");
                    System.out.println(student);
                    System.out.println("Name = " + student.getName());
                    System.out.println("Age = "  + student.getAge());
                }                
            }catch(EOFException eof) {System.out.println("EOF Reading objects"); }
            finally {
                // If there is nothing to be read
                if (objectInputStream != null || fileInputStream != null) {
                    objectInputStream.close();
                    fileInputStream.close();    
                }
            }
    }
} // eof class ObjectInputOutputStream
