package com.revature.nabnak;

/* Nabnak is a kanban board for professionsl devs aimed to be a decent virtual board.
    The goal is to allow members to join the application, be assigned part of a team, and share their Kanban cards.

 */

import com.revature.nabnak.menus.RegisterMenu;
import com.revature.nabnak.menus.WelcomeMenu;
import com.revature.nabnak.models.Member;
import com.revature.nabnak.util.MenuRouter;
import org.w3c.dom.xpath.XPathNamespace;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;


public class MainDriver {

    public static void main(String[] args) {

    }
}

    //We need to receive input from a user!
    //This instance, BufferedReader, is used to get input from the user via the terminal
    //DRY Principle = DONT REPEAT YOURSELF


    public static void main(String[] args) throws IOException {

        BufferedReader terminalReader = new BufferedReader(new InputStreamReader(System.in));
        MenuRouter menuRouter = new MenuRouter();

        WelcomeMenu welcomeMenu = new WelcomeMenu(terminalReader, menuRouter);
        RegisterMenu registerMenu = new RegisterMenu(terminalReader, menuRouter);

        menuRouter.addMenu(welcomeMenu);
        menuRouter.addMenu(registerMenu);

        while(isRunning){
            menuRouter.transfer("/welcome");
        }
    }



        }



