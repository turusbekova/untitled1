package practice12;

public class AnimalData {
    private String name;
    private String moveType;
    private String sound;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() > 2){
            this.name = name;
        }
    }

    public String getMoveType() {
        return moveType;
    }

    public void setMoveType(String moveType) {
        if (moveType.equals("fly") || moveType.equals("swim") || moveType.equals("run") ||
        moveType.equals("crawl") || moveType.equals("jump")){
            this.moveType = moveType;
        }
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        if(sound.length() > 1){
            this.sound = sound;
        }
    }

    public void printSpeedAndGroup(double avgSpeed) {
        if (avgSpeed >= 0){
            System.out.println("Average speed is: " + avgSpeed);
            if (avgSpeed > 30){
                System.out.println("Animal group is: SUPER FAST");
            }
            else if (avgSpeed > 20 && avgSpeed <= 30){
                System.out.println("Animal group is: FAST");
            }
            else if (avgSpeed > 10 && avgSpeed <= 20 ){
                System.out.println("Animal group is: MEDIUM");
            }
            else{
                System.out.println("Animal group is: SLOW");
            }
        }
    }

    @Override
    public String toString() {
        return "AnimalData{" +
                "name='" + name + '\'' +
                ", moveType='" + moveType + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
