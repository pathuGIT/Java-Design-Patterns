package HomeTheater;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Light light;
    private Sound sound;
    private Projector projector;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Light light, Sound sound, Projector projector) {
        this.dvdPlayer = dvdPlayer;
        this.light = light;
        this.sound = sound;
        this.projector = projector;
    }

    public void movieStart(String name){
        System.out.println("\n[Starting Movie Mode]");
        light.dim(30);
        projector.on();
        sound.on();
        sound.setVolume(50);
        dvdPlayer.on();
        dvdPlayer.play(name);
    }

    public void endMovie() {
        System.out.println("\n[Shutting Down Movie Mode]");
        dvdPlayer.off();
        projector.off();
        sound.off();
        light.dim(100);
    }
}
