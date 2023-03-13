class India{
    public void callerTune() // overridden
    {
        System.out.println("Tone before Covid-19---> "+"Different JioTunes");
    }
}
class Maharashtra extends India
{

    public void callerTune() // overriding
    {
        System.out.println("Tone between Covid-19 in Maharashtra  ---> "+"Marathi Lang..");
    }
}
class Punjab extends India{

    public void callerTune() // overriding
    {
        System.out.println("Tone between Covid-19 in Punjab ---> "+"Punjabi Lang..");
    }
}
class Karnatka extends India{

    public void callerTune() // overriding --> here subclass has full freeDom to change implementation of super class methods
    {
        System.out.println("Tone between Covid-19 in Karnatka---> "+"Telgu Lang..");
    }
}
public class CoranaTone {

    public static void main(String[] args) {

        India i1 = new India();
        i1.callerTune();

        Maharashtra m1 = new Maharashtra();
        m1.callerTune();

        Punjab p1 = new Punjab();
        p1.callerTune();

        Karnatka k1 = new Karnatka();
        k1.callerTune();
    }


}
