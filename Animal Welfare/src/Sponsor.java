public class Sponsor {
    private String name;
    private String contactInformation;
    private double donationAmount;

    public Sponsor(String name, String contactInformation, double donationAmount) {
        this.name = name;
        this.contactInformation = contactInformation;
        this.donationAmount = donationAmount;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public double getDonationAmount() {
        return donationAmount;
    }

    public void setDonationAmount(double donationAmount) {
        this.donationAmount = donationAmount;
    }
}

