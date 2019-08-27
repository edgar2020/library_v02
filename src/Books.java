public class Books implements LibraryBooks
{
    String title, author, condit;
    boolean BookcheckOut=false;
    int barcode, studentId;
    public int newBarcode= 00000000;
    public Books()
    {
        title="N/A";
        author="N/A";
        condit="N/A";
        barcode = 00000000;
        studentId = 000000;
    }//end of default constructor

    public Books(String title, String author, String condit, boolean BookcheckOut)
    {
        newBarcode++;
        this.title = title;
        this.author = author;
        this.condit = condit;
        this.BookcheckOut = BookcheckOut;
        this.barcode = newBarcode;
        this.studentId = 000000;
    }//end of full Arg constructor

    public Books(String title, String author, String condit, boolean BookcheckOut, int barcode, int studentId)
    {
        newBarcode++;
        this.title = title;
        this.author = author;
        this.condit = condit;
        this.BookcheckOut = BookcheckOut;
        this.barcode = newBarcode;
        this.studentId = studentId;
    }//end of full Arg constructor

    public boolean isBookcheckOut()
    {
        return BookcheckOut;
    }

    public void setBookcheckOut(boolean bookcheckOut)
    {
        BookcheckOut = bookcheckOut;
    }

    @Override
    public String beingUsed()
    {
        return "Book "+title+" being used: "+BookcheckOut;
    }

    @Override
    public void checkOut()
    {
        BookcheckOut=true;
    }

    @Override
    public void BookReturn()
    {
        BookcheckOut=false;
    }

    @Override
    public void condition(String Condition)
    {
        condit=Condition;
    }
}//end of class books
