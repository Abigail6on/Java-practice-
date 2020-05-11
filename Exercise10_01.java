public class Exercise10_01{
    public static void main(String[] args) {
        Time time1 = new Time(555550000);
        Time time2 = new Time();
        //System.out.print("GMT: ");
        System.out.printf("%d:%d:%d",
            time2.getHour(),
            time2.getMinute(),
            time2.getSecond());
        System.out.println (" GMT");
        System.out.println ();
        System.out.printf("%d:%d:%d%n%n",
            time1.getHour(),
            time1.getMinute(),
            time1.getSecond());
           
        
    }
}

class Time {
    int Hour;
    int Minute;
    int Second;
    long Time;

    public Time() {
        Time = System.currentTimeMillis();
        
    }

    public Time(long time) {
        Time = time;
    }
    public Time(int hour, int minute, int second) {
        Hour = hour;
        Minute = minute;
        Second = second;
    }

    public void setTime(long elapsedTime) {
        Time = elapsedTime;
    }


    public int getHour() {
        return (int)(Time / (1000 * 60 * 60)) % 24;
    }

    public int getMinute() {
        return (int)(Time / (1000 * 60)) % 60;
    }

    public int getSecond() {
        return (int)(Time / 1000) % 60;
    }

}