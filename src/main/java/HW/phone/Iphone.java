package HW.phone;

public class Iphone extends Phone implements Listening,Filming {
    @Override
    void receiveSms(String text) {
        System.out.println("Receive sms on Iphone");

    }

    @Override
    public void listenToTrack(String track) {
        System.out.println("listen to " +track+ " on iphone");
    }

    @Override
    public void listenToPodcast() {

    }

    @Override
    public void makeVideo() {

    }

    @Override
    public void makePhoto() {
        initCamera();
        takeShot();
        closeCamera();
    }

    private void initCamera () {
        System.out.println("Camera initialized");
    }
    private void takeShot() {
        System.out.println("Click");
    }
    private void closeCamera(){
        System.out.println("Camera closed");
    }

}
