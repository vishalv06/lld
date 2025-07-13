package designpatterns.creational.Singleton;

public class TestLicenseManager {
    public static void main(String[] args) {
        LicenseManager licenseManager1 = LicenseManager.getInstance();
        LicenseManager licenseManager2 = LicenseManager.getInstance();
        System.out.println(licenseManager1.isFeatureEnabled("EXPORT_CSV"));
        System.out.println(licenseManager2.isFeatureEnabled("ADVANCED_AI"));
        System.out.println(licenseManager1==licenseManager2);
    }
}
