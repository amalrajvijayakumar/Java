public class Theatre
{
public static void main (String [] args)
{
Theatre Rohini_theatre = new Theatre();
Rohini_theatre.show(120,4);
}
void show(int ticket_price,int no_of_persons)
{
System.out.println(ticket_price*no_of_persons);
}
}
