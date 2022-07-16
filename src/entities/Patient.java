package entities;

public class Patient {

    private String FullName;
    private Integer Age;
    private String BirthDate;
    private Integer Id;
    private Double BloodPressure;
    private String BloodType;
    private Double HeartRate;
    private Double Weigth;
    private Double Height;
    private String HepatitisB;
    private String AVC;
    private String Highpressure;
    private String Diabetes;
    private String Infarction;
    private String Thrombosis;
    private String Pregnant;
    private String nameParent;
    private String adressParent;
    private String grauParent;
    private String phoneResidencialParent;
    private String phoneParent;
    private String emailParent;
    private String afirmationData;


    public Patient() {
    }

    public Patient(String fullName, Integer age, String birthDate, Integer id, Double bloodPressure, String bloodType, Double heartRate, Double weigth, Double height, String hepatitisB, String AVC, String highpressure, String diabetes, String infarction, String thrombosis, String pregnant) {
        FullName = fullName;
        Age = age;
        BirthDate = birthDate;
        Id = id;
        BloodPressure = bloodPressure;
        BloodType = bloodType;
        HeartRate = heartRate;
        Weigth = weigth;
        Height = height;
        HepatitisB = hepatitisB;
        this.AVC = AVC;
        Highpressure = highpressure;
        Diabetes = diabetes;
        Infarction = infarction;
        Thrombosis = thrombosis;
        Pregnant = pregnant;

    }

    public Patient(String nameParent, String adressParent, String grauParent, String phoneResidencialParent, String phoneParent, String emailParent, String afirmationData) {
        this.nameParent = nameParent;
        this.adressParent = adressParent;
        this.grauParent = grauParent;
        this.phoneResidencialParent = phoneResidencialParent;
        this.phoneParent = phoneParent;
        this.emailParent = emailParent;
        this.afirmationData = afirmationData;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Double getBloodPressure() {
        return BloodPressure;
    }

    public void setBloodPressure(Double bloodPressure) {
        BloodPressure = bloodPressure;
    }

    public String getBloodType() {
        return BloodType;
    }

    public void setBloodType(String bloodType) {
        BloodType = bloodType;
    }

    public Double getHeartRate() {
        return HeartRate;
    }

    public void setHeartRate(Double heartRate) {
        HeartRate = heartRate;
    }

    public Double getWeigth() {
        return Weigth;
    }

    public void setWeigth(Double weigth) {
        Weigth = weigth;
    }

    public Double getHeight() {
        return Height;
    }

    public void setHeight(Double height) {
        Height = height;
    }

    public String getHepatitisB() {
        return HepatitisB;
    }

    public void setHepatitisB(String hepatitisB) {
        HepatitisB = hepatitisB;
    }

    public String getAVC() {
        return AVC;
    }

    public void setAVC(String AVC) {
        this.AVC = AVC;
    }

    public String getHighpressure() {
        return Highpressure;
    }

    public void setHighpressure(String highpressure) {
        Highpressure = highpressure;
    }

    public String getDiabetes() {
        return Diabetes;
    }

    public void setDiabetes(String diabetes) {
        Diabetes = diabetes;
    }

    public String getInfarction() {
        return Infarction;
    }

    public void setInfarction(String infarction) {
        Infarction = infarction;
    }

    public String getThrombosis() {
        return Thrombosis;
    }

    public void setThrombosis(String thrombosis) {
        Thrombosis = thrombosis;
    }

    public String getPregnant() {
        return Pregnant;
    }

    public void setPregnant(String pregnant) {
        Pregnant = pregnant;
    }
}
