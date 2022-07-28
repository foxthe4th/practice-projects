package com.revature.nabnak.util;

public class MenuRouter {

    private final Menu[] menus;

    public MenuRouter(){
        menus = new Menu[10];

    }

    public void addMenu(Menu addedMenu){
       for(int i = 0, i<menus.length, i++){
           if(menus[i] == null) {
               menus[i] = addedMenu;
               break;
           }else if(menus[i] != null){
               System.out.println("Next index please.");

           }

       }

    }

    public void transfer(String route){
        for(Menu menu: menus){
            if(menu == null) break;
            if(menu.getRoute().equals(route)){
                try {

                    menu.render();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
