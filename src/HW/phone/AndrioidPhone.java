package HW.phone;

public class AndrioidPhone extends Phone implements Listening, Filming{
    @Override
    void receiveSms(String text) {
        System.out.println("Receive sms on android: " + text);
    }

    @Override
    public void makePhoto() {

    }

    @Override
    public void makeVideo() {

    }

    @Override
    public void listenToPodcast() {

    }


    public void listenToTrack(String track) {
        System.out.println("listen to " +track+ " on android");
    }
}
