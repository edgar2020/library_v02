public class TextBook implements LibraryBooks
{
    String Subject, Publisher, condit;
    boolean BookcheckOut=false;
    int barcode, studentId;
    public TextBook()
    {
        Subject="N/A";
        Publisher="N/A";
        BookcheckOut=false;
        barcode = 00000000;
        studentId = 000000;
    }//end of 0 arg constructor

    public TextBook(String subject, String publisher, String condit, boolean BookcheckOut, int barcode, int studentId)
    {
        Subject = subject;
        Publisher = publisher;
        this.condit = condit;
        this.BookcheckOut = BookcheckOut;
        this.barcode = barcode;
        this.studentId = studentId;
    }//end of full constructor

    @Override
    public void condition(String Condition)
    {
        condit=Condition;
    }

    @Override
    public void BoookReturn()
    {
        BookcheckOut=false;
    }

    @Override
    public void checkOut()
    {
        BookcheckOut=true;
    }
}
