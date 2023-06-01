//
//  mainMenu.hpp
//  Sandsweeper C++ Game
//
//  Created by Ajitesh Nagarajan on 2023-05-15.
//
#pragma once
#include <SFML/Graphics.hpp>
#include <iostream>

using namespace sf;
using namespace std;

#define optSelect 4

class mainMenu { //creating class for the main menu that gives the user the option to either select the difficulty, or exit the application
private:
    int mainMenuSelected;
    Font f;
public:
    Text menuOpts[optSelect];
    mainMenu(float w, float h);
    void goUp();
    void goDown();
    void draw(RenderWindow& window);

    int mainMenuClick(){
        return mainMenuSelected;
    }
    ~mainMenu();
};

