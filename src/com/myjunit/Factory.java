package com.myjunit;

public  class Factory {

    public static GUIFactory createFactory(String factory_type) {
        switch (factory_type) {

            case "WinF":
                return new WinFactory();

            case "OSXF":
                return new OSXFactory();
            default:return null;
        }
    }

}
