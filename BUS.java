public class BUS extends TRANSPORT {
        int Passenger = 0;
        int maxPassenger = 30;
        boolean Running = true;
        int fee = 1000;

    public BUS(int passenger, int maxPassenger, boolean running, int fee) {
        Passenger = passenger;
        this.maxPassenger = maxPassenger;
        Running = running;
        this.fee = fee;
    }
    public void showInfo(){
        System.out.println(this.fee + Passenger);
    }
}

