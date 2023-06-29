package Workshop2;

public class Trafficlight {

    public class TrafficLight {

        String colour ;
        int Duration;

        public TrafficLight(String colour,int duration){

            colour = colour;
            duration = duration;
        }

        public void changeColour(String newcolour) {

            colour = newcolour;

        }
        public boolean isRed() {
            return colour.equals("Red");
        }

        public boolean isGreen() {
            return colour.equals("green"):

        }

        public int getDuration() {
            return Duration;
        }
        public int setDuration() {
            duration = duration;
        }
        public class Main{
            public static void main(String[] args) {
                TrafficLight light = new TrafficLight("red" , 40);
                System.out.println("The light is red" +light.isRed());
                System.out.println("The light is green" +light.isGreen());

                light.changeColour("green");

                System.out.println("The light is red" +isRed());
                System.out.println("The light is green" +isGreen());
                light.setDuration(30);
                System.out.println("The light duration is now "+ light.getDuration());

            }
        }
    }


}
