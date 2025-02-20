package PlayerCase;

public class AudioPlayerDemo {
    public static void main(String[] args) {
        MP4Player mp4Player = new MP4Player();
        AudioPlayer audioPlayer = new AudioPlayerAdapter();
        audioPlayer.play("mp4","video.mp4");
        audioPlayer.play("wav","video.wav");

    }
}
