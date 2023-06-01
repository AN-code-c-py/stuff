//
//  Sandsweeper.cpp
//  Sandsweeper C++ Game
//
//  Created by Ajitesh Nagarajan on 2023-05-04.
//

#include <iostream>
#include <SFML/Graphics.hpp>
#include <vector>
#include "mainMenu.hpp"
#include <unistd.h>

using namespace sf;
using namespace std;

vector<int>boardSizes = {14,21,28}; //board sizes depending on difficulty
vector<int>mines= {30,60,90}; //mines depending on diffiiculty


struct place { //structure for row (r) and column (c)
    int r;
    int c;
};

place t[1000000]; //initializing array created from above function
int counterL, counterE, iMove, flagPlace = 0;

void bombCheck(int S, int *board, int c){ //check for whether tile has bomb or not
    for (int i = 1; i <= S; i++){
        for (int j = 1; j <= S; j++){
            if (*(board+i*c+j) != 9){
                int noBombs = 0;
                if (*(board+(i-1)*c+(j-1)) == 9){
                    noBombs++;
                }
                if (*(board+(i-1)*c+j) == 9){
                    noBombs++;
                }
                if (*(board+(i-1)*c+(j+1)) == 9){
                    noBombs++;
                }
                if (*(board+i*c+(j-1)) == 9){
                    noBombs++;
                }
                if (*(board+i*c+(j+1)) == 9){
                    noBombs++;
                }
                if (*(board+(i+1)*c+(j-1)) == 9){
                    noBombs++;
                }
                if (*(board+(i+1)*c+j) == 9){
                    noBombs++;
                }
                if (*(board+(i+1)*c+(j+1)) == 9){
                    noBombs++;
                }
                *(board+i*c+j) = noBombs;
            }
        }
    }
}

void userBoardInnit(int S, int *userBoard, int c){ //function to initialize values of userboard array to 10
    for(int i=1; i<=S; i++){
        for (int j = 1; j <= S; j++){
            *(userBoard+i*c+j) = 10;
        }
    }
}

void bombsInnit(int a, int b, int S, int *board, int diffSect, int c){ // function to initialize bomb locations on board (a, b are the coordonates of the initial move)
    for (int i = 1; i <= mines[diffSect]; i++){
        int x = rand() % S + 1;
        int y = rand() % S + 1;
        if (x == a && y == b){
            int x = rand() % S + 1;
            int y = rand() % S + 1;
            *(board+x*c+y)= 9;
        }else{
            *(board+x*c+y) = 9;
        }
    }
}

void checkIt(int i, int j, int S, int *board, int *userBoard, int c) // function to reveal tiles that have been sent to the function (i and j are the coordinates of tile sent in array) or are next to the tile and are ready to be revealed
{
    *(userBoard+i*c+j) = 0;
    if (*(board+(i-1)*c+(j-1)) == 0 && i - 1 > 0 && i - 1 <= S && j - 1 > 0 && j - 1 <= S){
        t[counterL].c = i - 1;
        t[counterL].r = j-1;
        counterL++;
    }if (*(board+(i-1)*c+j) == 0 && i - 1 > 0 && i - 1 <= S && j > 0 && j <= S){
        t[counterL].c = i-1;
        t[counterL].r = j;
        counterL++;
    }if (*(board+(i-1)*c+(j+1)) == 0 && i - 1 > 0 && i - 1 <= S && j + 1 > 0 && j + 1 <= S){
        t[counterL].c = i - 1;
        t[counterL].r = j+1;
        counterL++;
    }if (*(board+i*c+(j-1)) == 0 && i > 0 && i <= S && j - 1 > 0 && j - 1 <= S){
        t[counterL].c = i;
        t[counterL].r = j - 1;
        counterL++;
    }if (*(board+i*c+(j+1)) == 0 && i > 0 && i <= S && j + 1 > 0 && j + 1 <= S){
        t[counterL].c = i;
        t[counterL].r = j + 1;
        counterL++;
    }if (*(board+(i+1)*c+(j-1))== 0 && i + 1 > 0 && i + 1 <= S && j - 1 > 0 && j - 1 <= S){
        t[counterL].c = i+1;
        t[counterL].r = j - 1;
        counterL++;
    }if (*(board+(i+1)*c+j) == 0 && i + 1 > 0 && i + 1 <= S && j > 0 && j <= S){
        t[counterL].c = i + 1;
        t[counterL].r = j;
        counterL++;
    }if (*(board+(i+1)*c+(j+1)) == 0 && i + 1 > 0 && i + 1 <= S && j + 1 > 0 && j + 1 <= S){
        t[counterL].c = i + 1;
        t[counterL].r = j;
        counterL++;
    }
}

void moveIt(int i, int j, int *board, int *userBoard, int S, int c){ //This function makes sure that the board shown to the user and the other board used for calculations are the same (checking with coordinates i and j, which are the mouse poisition)
    if (*(board+i*c+j) == 0){
        *(userBoard+i*c+j) = 0;
        checkIt(i, j, S, board, userBoard, c);
        while (counterE < counterL){
            *(userBoard+(t[counterE].c)*c+(t[counterE].r)) = 0;
            counterE++;
        }
    }else{
        *(userBoard+i*c+j) = *(board+i*c+j);
    }if (*(board+(i-1)*c+(j-1)) != 9 && i - 1 > 0 && i - 1 <= S && j - 1 > 0 && j - 1 <= S){
        if (*(board+(i-1)*c+(j-1)) == 0){
            *(userBoard+(i-1)*c+(j-1)) = 0;
            checkIt(i - 1, j - 1, S, board, userBoard, c);
            while (counterE < counterL){
                *(userBoard+(t[counterE].c)*c+(t[counterE].r)) = 0;
                counterE++;
            }
        }else{
            *(userBoard+(i-1)*c+(j-1)) = *(board+(i-1)*c+(j-1));
        }
    }if (*(board+(i- 1)*c+(j)) != 9 && i - 1 > 0 && i - 1 <= S && j > 0 && j <= S){
        if (*(board+(i - 1)*c+j) == 0){
            *(userBoard+(i - 1)*c+j) = 0;
            checkIt(i - 1, j, S, board, userBoard, c);
            while (counterE < counterL){
                *(userBoard+(t[counterE].c)*c+(t[counterE].r)) = 0;
                counterE++;
            }
        }
        else{
            *(userBoard+(i - 1)*c+j) = *(board+(i- 1)*c+(j));
        }
    }if (*(board+(i-1)*c+(j+1)) != 9 && i - 1 > 0 && i - 1 <= S && j + 1 > 0 && j + 1 <= S){
        if (*(userBoard+(i-1)*c+(j+1)) == 0){
            *(userBoard+(i-1)*c+(j+1)) = 0;
            checkIt(i - 1, j + 1, S, board, userBoard, c);
            while (counterE < counterL){
                *(userBoard+(t[counterE].c)*c+(t[counterE].r)) = 0;
                counterE++;
            }
        }else{
            *(userBoard+(i-1)*c+(j+1)) = *(board+(i-1)*c+(j+1));
        }
    }if (*(board+i*c+(j-1)) != 9 && i > 0 && i <= S && j - 1 > 0 && j - 1 <= S){
        if (*(board+i*c+(j-1)) == 0){
            *(userBoard+i*c+(j-1)) = 0;
            checkIt(i, j - 1, S, board, userBoard, c);
            while (counterE < counterL){
                *(userBoard+(t[counterE].c)*c+(t[counterE].r)) = 0;
                counterE++;
            }
        }else{
            *(userBoard+i*c+(j-1)) = *(board+i*c+(j-1));
        }
    }if (*(board+i*c+(j+1)) != 9 && i > 0 && i <= S && j + 1 > 0 && j + 1 <= S){
        if (*(board+i*c+(j+1)) == 0){
            *(board+i*c+(j+1)) = 0;
            checkIt(i, j + 1, S, board, userBoard, c);
            while (counterE < counterL){
                *(userBoard+(t[counterE].c)*c+(t[counterE].r)) = 0;
                counterE++;
            }
        }else{
            *(userBoard+i*c+(j+1)) = *(board+i*c+(j+1));
        }
    }if (*(board+(i+1)*c+(j-1)) != 9 && i + 1 > 0 && i + 1 <= S && j - 1 > 0 && j - 1 <= S){
        if (*(board+(i+1)*c+(j-1))== 0){
            *(userBoard+(i+1)*c+(j-1)) = 0;
            checkIt(i + 1, j - 1, S, board, userBoard, c);
            while (counterE < counterL){
                *(userBoard+(t[counterE].c)*c+(t[counterE].r)) = 0;
                counterE++;
            }
        }else{
            *(userBoard+(i+1)*c+(j-1)) = *(board+(i+1)*c+(j-1));
        }
    }if (*(board+(i+1)*c+j) != 9 && i + 1 > 0 && i + 1 <= S && j > 0 && j <= S){
        if (*(board+(i+1)*c+j) == 0){
            *(userBoard+(i+1)*c+j) = 0;
            checkIt(i + 1, j, S, board, userBoard, c);
            while (counterE < counterL){
                *(userBoard+(t[counterE].c)*c+(t[counterE].r)) = 0;
                counterE++;
            }
        }else{
            *(userBoard+(i+1)*c+j) = *(board+(i+1)*c+j);
        }
    }if (*(board+(i+1)*c+(j+1)) != 9 && i + 1 > 0 && i + 1 <= S && j + 1 > 0 && j + 1 <= S){
        if (*(board+(i+1)*c+(j+1)) == 0){
            *(userBoard+(i+1)*c+(j+1)) = 0;
            checkIt(i + 1, j + 1, S, board, userBoard, c);
            while (counterE < counterL){
                *(userBoard+(t[counterE].c)*c+(t[counterE].r)) = 0;
                counterE++;
            }
        }else{
            *(userBoard+(i+1)*c+(j+1)) = *(board+(i+1)*c+(j+1));
        }
    }if (*(board+(i-1)*c+(j+2)) != 9 && i - 1 > 0 && i - 1 <= S && j + 2 > 0 && j + 2 <= S){
        if (*(board+(i-1)*c+(j+2)) == 0){
            *(userBoard+(i-1)*c+(j+2)) = 0;
            checkIt(i - 1, j + 2, S, board, userBoard, c);
            while (counterE < counterL){
                *(userBoard+(t[counterE].c)*c+(t[counterE].r)) = 0;
                counterE++;
            }
        }else{
            *(userBoard+(i-1)*c+(j+2)) = *(board+(i-1)*c+(j+2));
        }
    }
    if (*(board+i*c+(j+2)) != 9 && i > 0 && i <= S && j + 2 > 0 && j + 2 <= S){
        if (*(board+i*c+(j+2)) == 0){
            *(userBoard+i*c+(j+2)) = 0;
            checkIt(i, j + 2, S, board, userBoard, c);
            while (counterE < counterL){
                *(userBoard+(t[counterE].c)*c+(t[counterE].r)) = 0;
                counterE++;
            }
        }else{
            *(userBoard+i*c+(j+2)) = *(board+i*c+(j+2));
        }
    }if (*(board+(i+1)*c+(j+2)) != 9 && i + 1 > 0 && i + 1 <= S && j + 2 > 0 && j + 2 <= S){
        if (*(board+(i+1)*c+(j+2)) == 0){
            *(userBoard+(i+1)*c+(j+2)) = 0;
            checkIt(i + 1, j + 2, S, board, userBoard, c);
            while (counterE < counterL){
                *(userBoard+(t[counterE].c)*c+(t[counterE].r))= 0;
                counterE++;
            }
        }else{
            *(userBoard+(i+1)*c+(j+2)) = *(board+(i+1)*c+(j+2));
        }
    }
}



int main(){
    RenderWindow menu(VideoMode(1440,1200), "Sandsweeper: the Game", Style::Default);
    mainMenu menuOpts(menu.getSize().x,menu.getSize().y);//setting window for main menu
    Texture tile; //uploading textures into project
    tile.loadFromFile("/Users/ajiteshnagarajan/Documents/Sandsweeper C++ Game/Sandsweeper C++ Game/stuff/pixil-frame-0 (3).jpg");
    Texture winText;
    winText.loadFromFile("/Users/ajiteshnagarajan/Documents/Sandsweeper C++ Game/Sandsweeper C++ Game/stuff/611f68f47de1265.png");
    RectangleShape bg;
    bg.setSize(Vector2f(1440,1200));
    Texture background;
    background.loadFromFile("/Users/ajiteshnagarajan/Documents/Sandsweeper C++ Game/Sandsweeper C++ Game/stuff/pixil-frame-0 (4) (1) (1).jpg");
    bg.setTexture(&background);

    Sprite s(tile); //setting sprite to texture (note: each tile is 32 px by 32 px)
    while (menu.isOpen()){
        Event event;
        while (menu.pollEvent(event)){
            if (event.type == Event::Closed){
                menu.close();
            }
            if (event.type == Event::KeyReleased){
                if (event.key.code == Keyboard::Up){
                    menuOpts.goUp();
                    break;
                }
                if (event.key.code == Keyboard::Down){
                    menuOpts.goDown();
                    break;
                }
                if (event.key.code == Keyboard::Return){
                    if (menuOpts.mainMenuClick() != 3){
                        int test = menuOpts.mainMenuClick(); int arrTest; int macTest = boardSizes[test];
                        switch (test) {
                            case 0:
                                arrTest = 15;
                            case 1:
                                arrTest = 22;
                            case 2:
                                arrTest = 29;
                        }
                        int board[arrTest][arrTest];
                        int userBoard[arrTest][arrTest]; //board that will be viewed
                        userBoardInnit(macTest, *userBoard, arrTest);
                        RenderWindow game(VideoMode(1440, 1200), "Sandsweeper: the Game"); //setting window for main game
                        while (game.isOpen()){ //code that occurs while game window is open
                            Vector2i pos = Mouse::getPosition(game);
                            int x = pos.x / 32; //position of mice
                            int y = pos.y / 32;
                            Event e;
                            while (game.pollEvent(e)){
                                if (e.type == Event::Closed){
                                    game.close();
                                }
                                if (e.type == Event::MouseButtonPressed){ //code that occurs when left button is pressed
                                    if (e.key.code == Mouse::Left){
                                        if (iMove == 0){
                                            bombsInnit(x, y, macTest, *board, test, arrTest);
                                            bombCheck(macTest,*board, arrTest);
                                            moveIt(x, y, *board, *userBoard, macTest, arrTest);
                                            iMove = 1;
                                        }else if (board[x][y] == 0){ //code that occurs when right button is pressed
                                            checkIt(x, y, macTest, *board, *userBoard, arrTest);
                                            while (counterE < counterL){
                                                userBoard[t[counterE].c][t[counterE].r] = 0;
                                                counterE++;
                                            }
                                        }else{
                                            userBoard[x][y] = board[x][y];
                                        }
                                    }else if (e.key.code == Mouse::Right){
                                        if (userBoard[x][x] == 11){
                                            userBoard[x][y] = 10;
                                        }else if (userBoard[x][y] > 9){
                                            userBoard[x][y] = 11;
                                        }if (board[x][y] == 9){
                                            flagPlace++;
                                        }
                                    }
                                }
                            }
                            game.clear(Color::Cyan); //outputting everything
                            if (flagPlace == mines[test]){
                                Sprite win(winText);
                                win.setTexture(winText);
                                game.draw(win);
                                game.display();
                            }else{
                                for (int i = 1; i <= macTest; i++){
                                    for (int j = 1; j <= macTest; j++){
                                        if (userBoard[x][y] == 9){
                                            userBoard[i][j] = board[i][j];
                                        }
                                        s.setTextureRect(IntRect(userBoard[i][j] * 32, 0, 32, 32));
                                        s.setPosition(i * 32, j * 32);
                                        game.draw(s);
                                    }
                                }
                                game.display();
                            }
                        }
                    } else {
                        menu.close();
                        break;
                    }
                }
            }
        }
        menu.clear();
        menu.draw(bg);
        menuOpts.draw(menu);
        menu.display();
    }
}
