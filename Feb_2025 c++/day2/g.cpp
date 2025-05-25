#include<graphics>
#include <conio.h>
int main()
{
   int x = 300, y = 200, r = 50;
   int graphic_driver = DETECT, graphic_mode;
   initgraph(&graphic_driver, &graphic_mode, "//turboc3/bgi");
   setcolor(4);
   circle(x, y, r);
   getch();
   closegraph();
   return 0;
}