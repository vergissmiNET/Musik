public class Album {
    // Deklarieren der Variablen
    String albumTitle;
    String musician;
    Track[] tracks;

    // Konstruktor
    public Album(String albumTitle, String musician, Track[] tracks) {
        this.albumTitle = albumTitle;
        this.musician = musician;
        this.tracks = tracks;
    }

    // Berechnen der Gesamtzeit
    public double getTotalTime() {
        double time=0;
        for(Track tk : tracks) {
            time += tk.trackLength;
         }
        return time;
    }

    // Ausgabe

    public void printInfo() {
        // Album
        System.out.println("Album: " + albumTitle);
        System.out.println("Von: " + musician);
        System.out.println("Länge: " + getTotalTime());
        System.out.println();

        // Liste der Tracks
        for (int i = 0; i < tracks.length; i++) {
            System.out.println("Track " + (i + 1) + ": " + tracks[i].trackTitle + " [" + tracks[i].trackLength + "]");
        }
    }
}
