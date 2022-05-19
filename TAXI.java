public class TAXI {
    public class Taxi extends TRANSPORT {
        String Destination;
        int Distance;
        int baseDistance = 1;
        int baseFee = 3000;
        int extraFee = 1000;
        int fuel = 100;
        int allFee;
        boolean readyToCarryPassenger = true;
        int speed = 0;

        public Taxi(String destination, int distance, int baseDistance, int baseFee, int extraFee, int fuel, int allFee, boolean readyToCarryPassenger, int speed) {
            Destination = destination;
            Distance = distance;
            this.readyToCarryPassenger = readyToCarryPassenger;
            this.speed = speed;
        }

        public void setExtraFee(int extraFee, int Distance) {

            if(Distance-baseDistance<0){
                allFee = baseFee;
            }else {
                allFee = baseFee + (Distance-baseDistance) * extraFee;
            }
            System.out.println("총 요금은" + allFee+ "입니다");
        }
}}
