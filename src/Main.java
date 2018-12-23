public class Main {

    public static void main(String[] args) {
	Track t1 = new Track("Speak to Me", "speaktome.mp3", 3.95);
	Track t2 = new Track("On the Run", "ontherun.mp3", 3.57);
	Track t3 = new Track("Time", "time.mp3", 7.08);

	Track[] allTracks = {t1, t2, t3};

	Album a = new Album("The Dark Side of the Moon", "Pink Floyd", allTracks);
	a.printInfo();
    }

}
