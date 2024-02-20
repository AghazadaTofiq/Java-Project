import java.util.ArrayList;
import java.util.List;

class Charity<T> {
    private CharityType type;
    private List<Work<T>> works;
    private List<Sponsor> sponsors;

    Charity(CharityType type) {
        this.type = type;
        this.works = new ArrayList<>();
        this.sponsors = new ArrayList<>();
    }

    void addWork(Work<T> work) {
        works.add(work);
    }

    List<Work<T>> getWorks() {
        return works;
    }

    public CharityType getType() {
        return type;
    }

    public void addSponsor(Sponsor sponsor) {
        sponsors.add(sponsor);
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }
}