package MobilePhone;


public class MobilePhone {
    private String imei;
    private PhoneManufacturer make;
    private String model;
    private int storageSpace;
    private static int simCardSlots;

    private static final String INVALID_IMEI = "INVALID_IMEI";

    //constructor with ni args
    private MobilePhone() {
        super();
    }

    //constructor with single parameter
    public MobilePhone(String imei) {
        if (imei == "") {
            this.imei = MobilePhone.INVALID_IMEI;
        } else {
            this.imei = imei;
        }
    }

    public MobilePhone(String imeiNumber, PhoneManufacturer phoneMake) {
        this(imeiNumber);
        make = phoneMake;
    }

    public MobilePhone(String imeiNumber, PhoneManufacturer phoneMake, String phoneModel) {
        this(imeiNumber, phoneMake);
        model = phoneModel;
    }

    public MobilePhone(String imeiNumber, PhoneManufacturer phoneMake, int storage) {
        this(imeiNumber, phoneMake);
        storageSpace = storage;
    }

    public MobilePhone(String imeiNumber, PhoneManufacturer phoneMake, String phoneModel, int storage) {
        this(imeiNumber, phoneMake, phoneModel);
        storageSpace = storage;
    }

    public static void setSimCardSlots(int simCardSlots) {
        MobilePhone.simCardSlots = simCardSlots;
    }



    public void setImei(String imeiNumber) {
        imei = imeiNumber;
    }

    public String getImei() {
        return this.imei;
    }

    public PhoneManufacturer getMake() {
        return make;
    }

    public void setMake(PhoneManufacturer make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorageSpace() {
        return storageSpace;
    }

    public void setStorageSpace(int storageSpace) {
        this.storageSpace = storageSpace;
    }

    public Connection makeCall(int phoneNumber) {
        Connection theCall = new Connection();
            return theCall;
        }

    public int getSimCardSlots() {
        return simCardSlots;
    }
}
