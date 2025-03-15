classDiagram
direction BT
class AbstractFactory {
  ~ createPainting(String) PaintCompany
  ~ createBuilding(String) BuildingCompany
}
class BuildingCompany {
<<Interface>>
  + build() void
}
class BuildingCompanyFactory {
  ~ createBuilding(String) BuildingCompany
  ~ createPainting(String) PaintCompany
}
class Chair {
  + build() void
}
class CompanyDemo {
  + main(String[]) void
}
class CompanyProducer {
  + getFactory(String) AbstractFactory
}
class Hall {
  + paint() void
}
class Home {
  + paint() void
}
class PaintCompany {
<<Interface>>
  + paint() void
}
class PaintingCompanyFactory {
  ~ createBuilding(String) BuildingCompany
  ~ createPainting(String) PaintCompany
}
class Table {
  + build() void
}

BuildingCompanyFactory  -->  AbstractFactory 
BuildingCompanyFactory  ..>  Chair : «create»
BuildingCompanyFactory  ..>  Table : «create»
Chair  ..>  BuildingCompany 
CompanyProducer  ..>  BuildingCompanyFactory : «create»
CompanyProducer  ..>  PaintingCompanyFactory : «create»
Hall  ..>  PaintCompany 
Home  ..>  PaintCompany 
PaintingCompanyFactory  -->  AbstractFactory 
PaintingCompanyFactory  ..>  Hall : «create»
PaintingCompanyFactory  ..>  Home : «create»
Table  ..>  BuildingCompany 
