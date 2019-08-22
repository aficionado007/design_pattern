package com.myjunit;

public class WinFactory implements GUIFactory {
    @Override
    public Button createButton()
    {
        WinButton winb=new WinButton() ;
        return winb;
    }
}
