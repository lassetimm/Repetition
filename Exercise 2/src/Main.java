class vehicle {
    public void vehicle(){
        System.out.println("This is a vehicle");
    }
}

class car extends vehicle{
    public void car(){
        System.out.println("This is car");
    }
}

class cycle extends vehicle{
    public void cycle(){
        System.out.println("This is cycle");
    }
}




public class Main {
    public static void main(String[] args) {

        cycle mountainbike = new cycle();
        car volvo = new car();
        volvo.car();
        volvo.vehicle();

        mountainbike.cycle();
        mountainbike.vehicle();//I know en cykel ikke er et vehicle men det er her er bare eksembler

    }
}
