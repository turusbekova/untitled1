package practice13;

public class iPhone extends CellPhone{

    private String type;
    private String cameraSpace;
    private String security;

    public iPhone(String type, String cameraSpace, String security) {
        this.type = type;
        this.cameraSpace = cameraSpace;
        this.security = security;
    }

    public String getType() {
        return type;
    }

    public String getCameraSpecs() {
        return cameraSpace;
    }

    @Override
    public void setCameraSpecs(String cameraSpecs) {
        this.cameraSpace = cameraSpecs;
    }

    @Override
    public void call(String number) {
        System.out.println("Calling to " + number + " from iPhone...");
    }

    @Override
    public void text(String number, String message) {
        System.out.println("Sending a message " + "\"" + message + "\"" + " to " + number + " from iPhone...");
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo from iPhone " + type + " with " + cameraSpace);
    }

    @Override
    public void unlock() {
        System.out.println("Unlocking using " + security);
    }

    @Override
    public void externalStorage(String type, int size) {

    }


}
