public class Fridge {
    private int distance;
    private int height;
    private int vathos;
    private String onomakataskeuasth;
    private String onomasuskeuhs;
    private String tupos;
    private int katanalwsh;
    private String xrwma;
    private int timh;
    private int programmata;
    private int thorivos;
    private int xwritikothta;

    /** me th xrhsh set thetoume tis parapanw times */
    public void Setdistance(int distance){this.distance = distance;}
    public void Setheight(int height){this.height = height;}
    public void Setvathos(int vathos){this.vathos = vathos;}
    public void Setonomakataskeuasth(String onomakataskeuasth){this.onomakataskeuasth = onomakataskeuasth;}
    public void Setonomasuskeuhs(String onomasuskeuhs){this.onomasuskeuhs = onomasuskeuhs;}
    public void Settupos(String tupos){this.tupos = tupos;}
    public void Setkatanalwsh(int katanalwsh){this.katanalwsh = katanalwsh;}
    public void Setxrwma(String xrwma){this.xrwma = xrwma;}
    public void Settimh(int timh){this.timh = timh;}
    public void Setthorivos(int thorivos){this.thorivos = thorivos;}
    public void Setxwritikothta(int xwritikothta){this.xwritikothta = xwritikothta;}
    public void Setprogrammata(int programmata){this.programmata = programmata;}
    /** me to get tha epistrefoume autes tis times */
    public int Getdistance(){return distance;}
    public int Getheight(){return height;}
    public int Getvathos(){return vathos;}
    public String Getonomakataskeuasth(){return onomakataskeuasth;}
    public String Getonomasuskeuhs(){return onomasuskeuhs;}
    public String Gettupos(){return tupos;}
    public int Getkatanalwsh(){return katanalwsh;}
    public String Getxrwma(){return xrwma;}
    public int Gettimh(){return timh;}
    public int Getthorivos(){return thorivos;}
    public int Getxwritikothta(){return xwritikothta;}
    public int Getprogrammata(){return programmata;}
    static int FridgeCounter = 0;
    /** epistrefoume to plhthos twn suskeuwn */
    public int FridgeCounter()
    {
        System.out.printf("Fridges: ");
        return FridgeCounter;
    }
    Fridge( int distance,int height,int vathos,int katanalwsh,int timh,int thorivos,int xwritikothta,int programmata,String xrwma,String tupos,String onomakataskeuasth,String onomasuskeuhs )
    {
        try
        {
            Setdistance(distance);
            Setheight(height);
            Setvathos(vathos);
            Setkatanalwsh(katanalwsh);
            Settimh(timh);
            Setthorivos(thorivos);
            Setxwritikothta(xwritikothta);
            Setprogrammata(programmata);
            Settupos(tupos);
            Setxrwma(xrwma);
            Setonomakataskeuasth(onomakataskeuasth);
            Setonomasuskeuhs(onomasuskeuhs);
        }
        catch (Exception e)
        {
            System.out.println("error");
        }
        FridgeCounter = FridgeCounter + 1;
        Display();
    }
    public void Display()
    {
        System.out.printf("Tupos: %s\n",Gettupos());
        System.out.printf("Kataskeuasths: %s\n" , Getonomakataskeuasth());
        System.out.printf("%s - height:%dcm, distance:%dcm, vathos:%dcm\nKatanalwsh(ethsia): %dkW/h Timh: %d€\n",Getonomasuskeuhs(),Getheight(),Getdistance(),Getvathos(),Getkatanalwsh(),Gettimh());
        System.out.printf("Thorivos: %ddb Xwritikothta: %dlt\nXrwma: %s Programmata: %d\n\n",Getthorivos(),Getxwritikothta(),Getxrwma(),Getprogrammata());
    }
    private void periodicMantainance(){ }
}
