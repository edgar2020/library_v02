import java.util.ArrayList;
import java.math.*;

public class LibraryDriver
{
    public static void main(String[] args)
    {
        Books OfMiceAndMen = new Books("Of Mice and Men", "John Steinbeck", "Good", false);
        Books ThingsFallApart = new Books("Things Fall Apart", "Chinua Achebe", "Bad", false);
        Books GreatGatsby = new Books("The Great Gatsby", "F. Scott Fitzgerald", "Great", false);
        Books CaptainUnderpants = new Books("Captain Underpants", "Dav Pilkey", "horrible", false);
        Books Frankenstein = new Books("Frankenstein", "Mary Shelley", "Great", false);
        Books GregorTheOverlander = new Books("Gregor the Overlander", "Suzanne Collins", "Ok", false);

        TextBook Government = new TextBook("Government", "McGrawHills", "Good", false);
        TextBook Calculus = new TextBook("Calculus", "Holt", "Great", false);
        TextBook APLit = new TextBook("Liturature", "Privately Owned", "Ok", false);

        Computers Comp1 = new Computers("MicroSoft", false, 1);
        Computers Comp2 = new Computers("MicroSoft", false, 2);
        Computers Comp3 = new Computers("Mac", false, 3);
        Computers Comp4 = new Computers("MicroSoft", false, 4);
        Computers Comp5 = new Computers("MicroSoft", false, 5);
        Computers Comp6 = new Computers("Mac", false, 6);
        Computers Comp7 = new Computers("MicroSoft", false, 7);
        Computers Comp8 = new Computers("MicroSoft", false, 8);
        Computers Comp9 = new Computers("MicroSoft", false, 9);
        Computers Comp10 = new Computers("MicroSoft", false, 10);

        Computers[] LibraryComp = {Comp1, Comp2, Comp3, Comp4, Comp5, Comp6, Comp7, Comp8, Comp9, Comp10};
        TextBook[] textBooksinLibrary = {Government, Calculus, APLit};
        Books[] booksInLibrary = {CaptainUnderpants, Frankenstein, GreatGatsby, GregorTheOverlander, OfMiceAndMen, ThingsFallApart};


        for (int i = 0; i < 20; i++)
        {
            int RanCom = (int) Math.random() * 9;
            int RanTextBook = (int) Math.random() * 2;
            int RanBook = (int) Math.random() * 5;
            boolean CompInUSe = LibraryComp[RanCom].inUse;
            boolean TBInUSe = textBooksinLibrary[RanCom].isBookcheckOut();
            boolean BookInUSe = booksInLibrary[RanCom].isBookcheckOut();

            LibraryComp[RanCom].setInUse(!CompInUSe);

            LibraryComp[RanCom].setInUse(!TBInUSe);

            LibraryComp[RanCom].setInUse(!BookInUSe);
        }

            int ii = 0;
            int jj = 0;
            int ll = 0;
            for (Books a : booksInLibrary)
            {
                System.out.println(booksInLibrary[ii].beingUsed());
                ii++;
            }
            for (TextBook a : textBooksinLibrary)
            {
                System.out.println(textBooksinLibrary[jj].beingUsed());
                jj++;
            }
            for (Computers a : LibraryComp)
            {
                System.out.println(LibraryComp[ll].beingUsed());
                ll++;
            }


    }
}
