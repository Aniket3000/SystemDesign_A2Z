package DesignPatterns.Adapter;

public class Buisness {
    IMultiRestoApp multiRestoApp = new MultiRestoApp();
    multiRestoApp.displayMenus(new Xmldata());

    FancyUI3rdPartyAdapter adapter = new FancyUI3rdPartyAdapter();
    adapter.displayMenus(new Xmldata());
}
