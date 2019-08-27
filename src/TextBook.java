public class TextBook implements LibraryBooks
{
    String Subject, Publisher, condit;
    boolean BookcheckOut=false;
    int barcode, studentId;
    int newBarcode=50000000;
    public TextBook()
    {
        newBarcode++;
        Subject="N/A";
        Publisher="N/A";
        BookcheckOut=false;
        barcode = newBarcode;
        studentId = 000000;
    }//end of 0 arg constructor

    public TextBook(String subject, String publisher, String condit, boolean BookcheckOut)
    {
        newBarcode++;
        Subject = subject;
        Publisher = publisher;
        this.condit = condit;
        this.BookcheckOut = BookcheckOut;
        this.barcode = newBarcode;
        this.studentId = studentId;
    }//end of full constructor

    public boolean isBookcheckOut()
    {
        return BookcheckOut;
    }

    public void setIsBookcheckOut(boolean yes)
    {
        BookcheckOut=false;
    }





    @Override
    public String beingUsed()
    {
        return "Textbook "+Subject+" being used: "+BookcheckOut;
    }

    @Override
    public void condition(String Condition)
    {
        condit=Condition;
    }

    @Override
    public void BookReturn()
    {
        BookcheckOut=false;
    }

    @Override
    public void checkOut()
    {
        BookcheckOut=true;
    }


}
