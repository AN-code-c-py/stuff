//
//  mainMenu.cpp
//  Sandsweeper C++ Game
//
//  Created by Ajitesh Nagarajan on 2023-05-15.
//

#include "mainMenu.hpp"
#include <iostream>

using namespace std;
using namespace sf;

mainMenu::mainMenu(float w, float h) {
    if (!f.loadFromFile("/Users/ajiteshnagarajan/Documents/Sandsweeper C++ Game/Sandsweeper C++ Game/stuff/slkscr.ttf")){ //checking font
        cout << "File not found";
    }
    
    //easy difficulty
    menuOpts[0].setFont(f);
    menuOpts[0].setString("Easy");
    menuOpts[0].setPosition(300,400);
    menuOpts[0].setCharacterSize(70);
    menuOpts[0].setFillColor(Color{249, 210, 111});
    //medium difficulty
    menuOpts[1].setFont(f);
    menuOpts[1].setString("Medium");
    menuOpts[1].setPosition(300,500);
    menuOpts[1].setCharacterSize(70);
    menuOpts[1].setFillColor(Color{249, 210, 111});
    //hard difficulty
    menuOpts[2].setFont(f);
    menuOpts[2].setString("Hard");
    menuOpts[2].setPosition(300,600);
    menuOpts[2].setCharacterSize(70);
    menuOpts[2].setFillColor(Color{249, 210, 111});
    //exit game
    menuOpts[3].setFont(f);
    menuOpts[3].setString("Exit");
    menuOpts[3].setPosition(300,700);
    menuOpts[3].setCharacterSize(70);
    menuOpts[3].setFillColor(Color{249, 210, 111});
    
    mainMenuSelected = -1;
}
mainMenu::~mainMenu(){
    
}

//Outputting main menu
void mainMenu::draw(RenderWindow &window){
    for (int i = 0; i < optSelect; ++i){
        window.draw(menuOpts[i]);
    }
}

void mainMenu::goUp(){ //up arrow selection
    if ((mainMenuSelected - 1) >= 0){
        menuOpts[mainMenuSelected].setFillColor(Color{249, 210, 111});
        mainMenuSelected--;
        if (mainMenuSelected == -1){
            mainMenuSelected = 2;
        }
        menuOpts[mainMenuSelected].setFillColor(Color{133, 106, 25});
    }
}

void mainMenu::goDown(){//down arrow selection
    if ((mainMenuSelected + 1) <= optSelect){
        menuOpts[mainMenuSelected].setFillColor(Color{249, 210, 111});
        mainMenuSelected++;
        if (mainMenuSelected == 4){
            mainMenuSelected = 0;
        }
        menuOpts[mainMenuSelected].setFillColor(Color{133, 106, 25});
    }
}
