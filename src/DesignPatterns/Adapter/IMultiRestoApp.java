package DesignPatterns.Adapter;
//You can create an adapter. This is a special object that converts the interface of one object so that another object
//        can understand it.
//
//An adapter wraps one of the objects to hide the complexity of conversion happening behind the scenes.
// The wrapped object isn’t even aware of the adapter. For example, you can wrap an object that operates
// in meters and kilometers with an adapter that converts all of the data to imperial units such as
// feet and miles.
//
//Adapters can not only convert data into various formats but can also help objects with different
// interfaces collaborate.


public interface IMultiRestoApp {
    void displayMenus(XmlData xmlData);
    void displayRecommendations(XmlData xmlData);
}
