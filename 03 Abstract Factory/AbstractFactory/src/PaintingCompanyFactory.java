public class PaintingCompanyFactory extends AbstractFactory{
    @Override
    BuildingCompany createBuilding(String type) {
        return null;
    }

    @Override
    PaintCompany createPainting(String type) {
        if(type == null){
            return null;
        }
        if(type.equalsIgnoreCase("HALL")){
            return new Hall();
        } else if (type.equalsIgnoreCase("HOME")) {
            return new Home();
        }

        return null;
    }
}
