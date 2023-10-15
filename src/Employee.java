public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;


    //Employee sınıfının yapıcı metodu

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    //Vergi hesaplama

    double tax() {
        double tax = 0;
        if (this.salary > 1000) {
            tax = this.salary * 0.03;
        } else {
            System.out.println("Bu çalışanın maaşı 1000'den az vergi uygulanamaz.");
        }
        return tax;
    }

    //Bonus hesaplama

    int bonus() {
        int bonus = 0;
        if (this.workHours >= 40) {
            bonus = (this.workHours - 40) * 30;
        } else {
            bonus = 0;
        }
        return bonus;

    }

    //Maaş artışı hesaplama

    double raiseSalary() {
        int nowYear = 2021;
        double raise = 0;
        if (this.hireYear < nowYear) {
            if (nowYear - this.hireYear < 10) {
                raise = this.salary * 0.05;
            }

            if (nowYear - this.hireYear > 9 && nowYear - this.hireYear < 20) {
                raise = this.salary * 0.10;
            }
            if (nowYear - this.hireYear > 19) {
                raise = this.salary * 0.15;
            }
        } else {
            System.out.println("Çalışan işe yeni başlamış zam falan yok.");
        }
        return raise;
    }

    // Çalışan bilgileri
    void printEmployee() {
        System.out.println("           ");
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonus ile birlikte maaş : " + (this.salary - tax() + bonus()));
        System.out.println("Toplam Maaş : " + (this.salary - tax() + bonus() + raiseSalary()));


    }

}

