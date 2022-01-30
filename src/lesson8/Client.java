package lesson8;

public class Client extends Person implements Printable, ClickHandler{
    private Season season;

    Client(String name, int age, double deposit, Season seasonOfOpen){
       super(name, age, deposit);
       this.season=seasonOfOpen;
    }

    @Override
    public void sendLetter() {
        System.out.println("Отправка email клиенту " + this.getName());
    }

    @Override
    public void printInfo() {
        System.out.println("Информация о клиенте " + this.getName() + ": возраст: " + this.getAge() + ", депозит: " + this.getDeposit() + ", статус: " + this.getStatus());
    }

    @Override
    public void printSeason() {
        System.out.println("Сезон открытия вклада у клиента " + this.getName() + ": " + this.season + ", цвет сезона: " + this.season.getColor());
    }
}
