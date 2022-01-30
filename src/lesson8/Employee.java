package lesson8;

public class Employee extends Person implements Printable, ClickHandler{
    private Season season;

    Employee(String name, int age, double deposit, Season seasonOfOpen){
        super(name, age, deposit);
        this.season = seasonOfOpen;
    }

    @Override
    public void sendLetter() {
        System.out.println("Отправка email работнику " + this.getName());
    }

    @Override
    public void printInfo() {
        System.out.println("Информация о работнике " + this.getName() + ": возраст: " + this.getAge() + ", депозит: " + this.getDeposit() + ", статус: " + this.getStatus());
    }

    @Override
    public void printSeason() {
        System.out.println("Сезон открытия вклада у работника " + this.getName() + ": " + this.season + ", цвет сезона: " + this.season.getColor());
    }
}
