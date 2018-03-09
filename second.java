class first {
public int data ;
public void test (){
System . out . println ( " Function : test of base class " );
}
}
public class second extends first {
public int age;
public void newtest (){
System . out . println ( " Newly added function in derived class " );
}
public void test (){
System . out . println ( " Function : test of derived class " );
}
public static void main ( String args [])
{
first basec = new second ();
first based = new first ();
basec . test ();
based . test ();
}
}
