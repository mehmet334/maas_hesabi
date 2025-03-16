class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireyear;




    public Employee(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireyear() {
        return hireyear;
    }

    public void setHireyear(int hireyear) {
        this.hireyear = hireyear;
    }

    // Tax hesaplama metodu
    public double tax(){
        if (salary<1000){
            return 0;
        }else {
            return salary*0.03;
        }
    }

    //Bonus Hesaplama
    public double bonus(){
        if(workHours<=40){
            return 0;
        }else {
            return (workHours-40)*30;
        }
    }

    // Ücret Artışı
    public double raiseSalary(){
        int nowyear=2021;
        if (nowyear-hireyear<10){
            return salary*0.05;
        } else if (nowyear-hireyear>9 && nowyear-hireyear<20) {
            return salary*0.1;
        }else {
            return salary*0.15;
        }
    }

    @Override
    public String toString() {
        double taxHesap=tax();
        double bonusHesap=bonus();
        double raiseHesap=raiseSalary();
        double totalsalary=salary-taxHesap+bonusHesap+raiseHesap;

        return "--------------Bordro--------------\n" +
                "Adı : " + name + "\n" +
                "Maaşı : " + salary + "\n" +
                "Çalışma Saati : " + workHours + "\n" +
                "Başlangıç Yılı : " + hireyear + "\n" +
                "Vergi : " + taxHesap + "\n" +
                "Bonus : " + bonusHesap + "\n" +
                "Maaş Artışı : " + raiseHesap + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + (salary-taxHesap+bonusHesap) + "\n" +
                "Toplam Maaş : " + totalsalary + "\n" +
                "-----------------------------------";
    }
}
