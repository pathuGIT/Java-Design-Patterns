package HomeTheater;

public class ClientDemo {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Light light = new Light();
        Projector projector = new Projector();
        Sound sound = new Sound();

        HomeTheaterFacade facade = new HomeTheaterFacade(dvdPlayer,light,sound,projector);
        facade.movieStart("The Novel");
        facade.endMovie();
    }
}
