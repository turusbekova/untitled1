package pratcice9;

public class Clock {
    public int hours;
    public int minutes;
    public int seconds;

    public Clock() {
        // TODO implement no args constructor




    }

    public Clock(int seconds) {
        // TODO implement one arg constructor

    }

    public Clock(int hours, int minutes, int seconds) {
        //TODO implement all args constructor
       if (hours >= 0 && hours < 24){
           this.hours = hours;
       }
       else {
           this.hours = 0;
       }
       if (minutes > 0 && minutes < 60){
           this.minutes = minutes;
       }
       else {
           this.minutes = 0;
       }

    }

    public void setClock(int seconds) {
        //TODO implement this method

    }

    public int getHours() {
        //TODO implement this method
        return -1;
    }

    public void setHours(int hours) {
        //TODO implement this method

    }

    public int getMinutes() {
        //TODO implement this method
        return -1;
    }

    public void setMinutes(int minutes) {
        //TODO implement this method

    }

    public int getSeconds() {
        //TODO implement this method
        return -1;
    }

    public void setSeconds(int seconds) {
        //TODO implement this method

    }

    public void tick() {
        //TODO implement this method

    }


    public void tickDown() {
        //TODO implement this method

    }

    public void addClock(Clock clock) {
        //TODO implement this method

    }

    public Clock subtractClock(Clock clock) {
        //TODO implement this method
        return null;
    }

    @Override
    public String toString() {
        return "(" + String.format("%02d:%02d:%02d", this.getHours(), this.getMinutes(), this.getSeconds()) + ")";
    }
}