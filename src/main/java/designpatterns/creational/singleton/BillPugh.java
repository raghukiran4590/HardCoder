package designpatterns.creational.singleton;

public class BillPugh {
    private BillPugh() {}

    private static class BillPughHelper {
        private static final BillPugh billpughInstance = new BillPugh();
    }

    public static BillPugh getInstance() {
        return BillPughHelper.billpughInstance;
    }
}
