package PlayerCase;

public class AudioPlayerAdapter implements AudioPlayer{
    private MP4Player mp4Player = new MP4Player();
    private WAVPlayer wavPlayer = new WAVPlayer();

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp4")){
            mp4Player.playMP4(fileName);
        } else if (audioType.equalsIgnoreCase("wav")) {
            wavPlayer.playWAV(fileName);
        }else {
            System.out.println("Unsupported format: " + audioType);
        }
    }
}
