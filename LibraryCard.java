public class LibraryCard {
    private Student owner;
    private int borrowcnt;
    public LibraryCard(){
        owner = null;
        borrowcnt = 0;
    }
    public void checkOut(int numofBook){
        borrowcnt = borrowcnt + numofBook;
    }
    public void setOwnername(Student student){
        owner = student;
    }
    public int getNumberOfBooks(){
        return borrowcnt;
    }
    public String getOwnerName(){
        return owner.getName();
    }
    public String toString(){
        return "Owner Name" +owner.getName()+"\n"+"Email"+owner.getEmail()+"\n"+"Books Borrowed"+borrowcnt;
    }
}
