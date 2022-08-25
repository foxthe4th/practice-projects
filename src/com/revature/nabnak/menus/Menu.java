package com.revature.nabnak.menus;

import java.io.BufferedReader;

public abstract class Menu {  //an abstract class

        protected String name;//this only allows any class within the package or subclasses (any extending menu) to have access to this attribute
        protected String route;
        protected BufferedReader terminalReader; //Dependency injection - this is a requirement for the class to function that we want to inject at instantiation

        protected MenuRouter menuRouter;

        public Menu(String name, String route, BufferedReader terminalReader, MenuRouter menuRouter){
            this.name = name;
            this.route = route;
            this.terminalReader = terminalReader;
            this.menuRouter = menuRouter;
        }

        public String getName(){
            return name;
        }

        public String getRoute(){
            return route;
        }

        public BufferedReader terminalReader(){
            return terminalReader;
        }
    }

