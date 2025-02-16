public class CompanyDemo {
    public static void main(String[] args) {
        AbstractFactory factory = CompanyProducer.getFactory("PAINT");
        PaintCompany paintCompany = factory.createPainting("HALL");
        paintCompany.paint();
    }
}
