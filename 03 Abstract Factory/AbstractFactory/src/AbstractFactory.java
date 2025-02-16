public abstract class AbstractFactory {
    abstract BuildingCompany createBuilding(String type);
    abstract PaintCompany createPainting(String type);
}
