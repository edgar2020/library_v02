public class Books implements LibraryBooks
{
    String title, author, condit;
    boolean BookcheckOut=false;
    int barcode, studentId;
    public Books()
    {
        title="N/A";
        author="N/A";
        condit="N/A";
        barcode = 00000000;
        studentId = 000000;
    }//end of default constructor

    public Books(String title, String author, String condit, boolean BookcheckOut, int barcode, int studentId)
    {
        this.title = title;
        this.author = author;
        this.condit = condit;
        this.BookcheckOut = BookcheckOut;
        this.barcode = barcode;
        this.studentId = studentId;
    }//end of full Arg constructor

    @Override
    public void checkOut()
    {
        BookcheckOut=true;
    }

    @Override
    public void BoookReturn()
    {
        BookcheckOut=false;
    }

    @Override
    public void condition(String Condition)
    {
        condit=Condition;
    }
}//end of class books
