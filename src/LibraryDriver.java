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

        Computers temp = LibraryComp[2];
        System.out.println(temp.beingUsed());
        temp.setInUse(true);
        System.out.println(temp.beingUsed());

    }
}
