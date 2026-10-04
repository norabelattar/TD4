package isp;

public class DocumentReader implements Scanneur {

    private final Scanneur scanneur;

    public DocumentReader(Scanneur scanneur) {
        this.scanneur = scanneur;
    }

    public void scanner() {
        scanneur.scanner();
    }
}
