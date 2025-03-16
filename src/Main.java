import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Employee employee=new Employee();
        //Çalışan bilgileri alma

        System.out.println("Çalışanın adını giriniz");
        employee.setName(scanner.nextLine());

        System.out.println("Çalışanın maaşını giriniz:");
        employee.setSalary(scanner.nextDouble());

        System.out.println("Çalışma saatini giriniz:");
        employee.setWorkHours(scanner.nextInt());

        System.out.println("İşe başlama yılını giriniz: ");
        employee.setHireyear(scanner.nextInt());

        System.out.println(employee);

   }
}
