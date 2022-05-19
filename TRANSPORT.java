public class TRANSPORT {


    class Transport {
        String nums ;
        int fuel =100;
        int speed = 0;
        int getSpeed;
        int maxPassenger;
        int Passenger;

        public Transport(String nums, int speed, int getSpeed, int maxPassenger, int passenger) {
            this.nums = nums;
            this.speed = speed;
            this.getSpeed = getSpeed;
            this.maxPassenger = maxPassenger;
            Passenger = passenger;
        }

        public void Run (){
            System.out.println("운행 시작");
        }
        public void setGetSpeed(){
            System.out.println("속도를" + speed + getSpeed + "로 바꿉니다.");
        }
        public void Stop(){
            System.out.println("운행 중료");
        }
        public void getPassenger(int getPassenger){
            Passenger += getPassenger;
        }
}}
