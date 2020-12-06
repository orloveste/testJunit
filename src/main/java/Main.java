import service.BusinessService;

public class Main {
    public static void main(String[] args) {
        BusinessService service = new BusinessService();
        double tax = service.calculeazaTaxeSalariu(100,16);
        if (tax != 15) throw  new RuntimeException("eroare de calcul");

        System.out.println(tax);
//        System.out.println(new BusinessService().calculeazaTaxeSalariu(100, 15));
    }
}
