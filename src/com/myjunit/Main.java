package com.myjunit;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Factory.createFactory("WinF").createButton().paint();


        Factory.createFactory("OSXF").createButton().paint();

    }
}
