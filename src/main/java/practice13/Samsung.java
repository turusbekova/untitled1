package practice13;

public class Samsung  extends CellPhone{

//     *  create a new brand of cell phone type called Samsung
//         *   + this brand should have following specs
//         *      - type -> encapsulated, immutable and with dataType of String
//         *      - cameraSpecs -> encapsulated and with dataType of String
//         *      - security -> encapsulated, immutable and with dataType of String
//         *      - externalStorage -> encapsulated and with dataType of Integer
//         *   + Construct and initialize above fields
//         *
//                 *  + Implement all methods cell phone abstract class
//         *      - implement getter and setter for "type" and "externalStorage" fields
//         *      - implement call method so that when entered a phone number 911 it prints 'Calling to 911 from Samsung...'
//            *      - implement text method so that when entered a phone number 101 with message "help" it prints 'Sending message "help" to 101 from Samsung...'
//            *      - implement takePhoto method so that it prints 'Taking a photo from Samsung {type} with {cameraSpecs}'
//            *      - implement unlock method so that it prints 'Unlocking using {security}'
//            *      - create a method printExternalStorageSize so that it prints 'Samsung {type} has external storage of size: {externalStorage}'
//            * In this Demo class do following
//         *
    private String type;
    private String cameraSpace;
    private String security;
    private int externalStorage;

    public Samsung(String type, String cameraSpace, String security, int externalStorage) {
        this.type = type;
        this.cameraSpace = cameraSpace;
        this.security = security;
        this.externalStorage = externalStorage;
    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getExternalStorage() {
        return externalStorage;
    }

    public void setExternalStorage(int externalStorage) {
        this.externalStorage = externalStorage;
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
        System.out.println("Calling to " + number + " from Samsung...");
    }

    @Override
    public void text(String number, String message) {
        System.out.println("Sending a message " + "\"" +message + "\"" + " to " + number + " from Samsung...");
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo from Samsung " + type + " with " + cameraSpace);
    }

    @Override
    public void unlock() {
        System.out.println("Unlocking using " + security);
    }

    @Override
    public void externalStorage(String type, int size) {
        System.out.println("Samsung " + type + " has external storage of size: " + size);
    }

    public void printExternalStorageSize(){
        System.out.println("Samsung" + type + " has external storage of size: " + externalStorage);
    }
}
