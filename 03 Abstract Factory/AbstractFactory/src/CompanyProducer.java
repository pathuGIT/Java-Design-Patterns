public class CompanyProducer {
    public static AbstractFactory getFactory(String factoryType){
        if(factoryType == null){
            return null;
        }
        if(factoryType.equalsIgnoreCase("PAINT")){
            return new PaintingCompanyFactory();
        } else if (factoryType.equalsIgnoreCase("BUILDING")) {
            return new BuildingCompanyFactory();
        }
        return null;
    }
}
