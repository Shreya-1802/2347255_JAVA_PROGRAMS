abstract class LibraryResource {
    private String title;
    private String creator;

    public LibraryResource(String title, String creator) {
        this.title = title;
        this.creator = creator;
    }

    public abstract void displayInformation();

    public String getTitle() {
        return title;
    }

    public String getCreator() {
        return creator;
    }
}

class BookResource extends LibraryResource {
    protected int pageCount;

    public BookResource(String title, String creator, int pageCount) {
        super(title, creator);
        this.pageCount = pageCount;
    }

    protected int getPageCount() {
        return pageCount;
    }

    @Override
    public void displayInformation() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Creator: " + getCreator());
        System.out.println("Page Count: " + pageCount);
    }
}

class VideoResource extends LibraryResource {
    private int duration;

    public VideoResource(String title, String creator, int duration) {
        super(title, creator);
        this.duration = duration;
    }

    @Override
    public void displayInformation() {
        System.out.println("Video Title: " + getTitle());
        System.out.println("Creator: " + getCreator());
        System.out.println("Duration: " + duration + " minutes");
    }
}

final class ReferenceBookResource extends BookResource {
    public ReferenceBookResource(String title, String creator, int pageCount) {
        super(title, creator, pageCount);
    }

    @Override
    public void displayInformation() {
        System.out.println("Reference Book Title: " + getTitle());
        System.out.println("Creator: " + getCreator());
        System.out.println("Page Count: " + getPageCount());
        System.out.println("Note: This is a reference book and cannot be borrowed.");
    }
}

public class Lab3 {
    public static void main(String[] args) {
        BookResource book = new BookResource("Mickey Mouse", "Donald Duck", 1000);
        VideoResource video = new VideoResource("After Lab", "Jane Doe", 90);
        ReferenceBookResource refBook = new ReferenceBookResource("Algorithms Handbook", "CLRS", 1200);

        System.out.println("Book Information:");
        book.displayInformation();

        System.out.println("\nVideo Information:");
        video.displayInformation();

        System.out.println("\nReference Book Information:");
        refBook.displayInformation();
    }
}
