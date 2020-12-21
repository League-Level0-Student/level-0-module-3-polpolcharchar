
void setup() {
 
  // set the size of your sketch
  size(400,400);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int i = 400; i>0;i= i -8){
    if(i%16 == 0){
      fill(#FF0000);
    }
    else{
      fill(#000000);
    }
   ellipse(200,200,i,i); 
  }
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
