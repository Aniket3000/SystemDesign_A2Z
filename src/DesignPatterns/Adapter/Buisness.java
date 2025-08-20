package DesignPatterns.Adapter;

public class Buisness {
    IMultiRestoApp multiRestoApp = new MultiRestoApp();
    multiRestoApp.displayMenues();

    FancyUI3rdPartyAdapter adapter = new FancyUI3rdPartyAdapter();
    adapter.displayMenus(new Xmldata());
}
