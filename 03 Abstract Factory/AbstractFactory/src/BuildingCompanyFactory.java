public class BuildingCompanyFactory extends AbstractFactory{
    @Override
    BuildingCompany createBuilding(String type) {
        if(type == null){
            return null;
        }
        if(type.equalsIgnoreCase("CHAIR")){
            return new Chair();
        } else if (type.equalsIgnoreCase("TABLE")) {
            return new Table();
        }
        return null;
    }

    @Override
    PaintCompany createPainting(String type) {
        return null;
    }
}
