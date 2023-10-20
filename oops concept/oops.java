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
        int roomid;
        String roomtype;
        float roomarea;
        boolean acmachine;
        Scanner s = new Scanner(System.in);
        roomid = s.nextInt();
        roomtype = s.nextLine();
        acmachine = s.nextBoolean();
            
        Room room1=new Room();
        room1.setdata(roomid,roomtype,roomarea, acmachine);
        room1.displayData();
    }






    }

        
 
    
