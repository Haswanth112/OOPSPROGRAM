class   Room
{
    int Roomno;
    String Roomtype;
    float Roomarea;
    boolean Acmachine;
    void setdata(int Rno,String Rt,float area,boolean Ac)
    {
        Roomno   = Rno;
        Roomtype = Rt;
        Roomarea = area;
        Acmachine= Ac;
    }
    void displayData()
    {
        System.out.println("The Room is" + Roomno);
        System.out.println("The Room type is " + Roomtype);
        System.out.println("The Room area is " + Roomarea);
        String s=(Acmachine) ?   "yes" : "no";
        System.out.println("The A/c Machine needed" + s);
    }
    public static void main(String args[])
    {
        Room room1=new Room();
        room1.setdata(101,"luxury",990.21f, true);
        room1.displayData();
    }






    }

        
 
    
