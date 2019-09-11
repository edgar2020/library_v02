public class Computers
{
    int CompNum;
    String Brand;
    boolean inUse = false;

    public Computers(String brand, boolean inUse, int CompNum)
    {

        Brand = brand;
        this.CompNum=CompNum;
        this.inUse = inUse;
    }//end of full arg Constructor


    public Computers()
    {

        Brand = "Microsoft";
        CompNum=0;
        inUse=false;
    }//end of 0 arg constrtor

    public int getCompNum()
    {
        return CompNum;
    }

    public void setDeskTopNumber(int CompNum)
    {
        this.CompNum = CompNum;
    }

    public String getBrand()
    {
        return Brand;
    }

    public void setBrand(String brand)
    {
        Brand = brand;
    }

    public boolean isInUse()
    {
        return inUse;
    }

    public void setInUse(boolean inUse)
    {
        this.inUse = inUse;
    }


    public String beingUsed()
    {
        return "Computer "+getCompNum()+" being used: "+isInUse();
    }

    @Override
    public String toString()
    {
        return "Computers{" +
                "Computer Number=" + CompNum +
                ", Brand='" + Brand + '\'' +
                ", inUse=" + inUse +
                '}';
    }
}
