public class student1 {
    private String name;
    private String email;
    public Student(){
        name = "Unassiged";
        email = "Unassiged";
    }
    public void setName(String studentName){
        name = studentName;
    }
    public void setEmail(String address){
        email = address;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
}
