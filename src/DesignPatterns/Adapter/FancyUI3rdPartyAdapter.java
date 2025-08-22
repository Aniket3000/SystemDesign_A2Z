package DesignPatterns.Adapter;

public class FancyUI3rdPartyAdapter implements IMultiRestoApp{
    private final FancyUI3rdParty fancyUI3rdPartyService;

    public FancyUI3rdPartyAdapter(){
        fancyUI3rdPartyService = new FancyUI3rdParty();
    }
    @Override
    public void displayMenus(XmlData xmlData){
        JsonData jsonData = convertXMLToJson(xmlData);
        fancyUI3rdPartyService.displayMenus(jsonData);
    }

//    similarly for displayRecommendations

    @Override
    public void displayRecommendations(XmlData xmlData) {
//        same convert to json data
    }
}
