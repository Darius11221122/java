public class CD extends LibraryItem implements LoanItem {
    private String band;
    private String title;
    private int numTracks;

    public CD(String type, String id, String band, String title, int numTracks) {
        super(type, id);
        this.band = band;
        this.title = title;
        this.numTracks = numTracks;
    }

    public String getBand() {
        return band;
    }

    public String getTitle() {
        return title;
    }

    public int getNumTracks() {
        return numTracks;
    }

    @Override
    public double calculatePrice() {
        return numTracks * 1.0;
    }
}
