package entities;

public class Patient {

    private String FullName;
    private Integer Age;
    private Integer BirthDate;
    private Integer Id;
    private Double BloodPressure;
    private String BloodType;
    private Double HeartRate;
    private Double Weigth;
    private Double Height;
    private Double HepatitisB;
    private Double AVC;
    private Double Highpressure;
    private Double Diabetes;
    private Double Infarction;
    private Double Thrombosis;
    private Double Pregnant;


    public Patient() {
    }

    public Patient(String fullName, Integer age, Integer birthDate, Integer id, Double bloodPressure, String bloodType, Double heartRate, Double weigth, Double height, Double hepatitisB, Double AVC, Double highpressure, Double diabetes, Double infarction, Double thrombosis, Double pregnant) {
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

    public Integer getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Integer birthDate) {
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

    public Double getHepatitisB() {
        return HepatitisB;
    }

    public void setHepatitisB(Double hepatitisB) {
        HepatitisB = hepatitisB;
    }

    public Double getAVC() {
        return AVC;
    }

    public void setAVC(Double AVC) {
        this.AVC = AVC;
    }

    public Double getHighpressure() {
        return Highpressure;
    }

    public void setHighpressure(Double highpressure) {
        Highpressure = highpressure;
    }

    public Double getDiabetes() {
        return Diabetes;
    }

    public void setDiabetes(Double diabetes) {
        Diabetes = diabetes;
    }

    public Double getInfarction() {
        return Infarction;
    }

    public void setInfarction(Double infarction) {
        Infarction = infarction;
    }

    public Double getThrombosis() {
        return Thrombosis;
    }

    public void setThrombosis(Double thrombosis) {
        Thrombosis = thrombosis;
    }

    public Double getPregnant() {
        return Pregnant;
    }

    public void setPregnant(Double pregnant) {
        Pregnant = pregnant;
    }
}
