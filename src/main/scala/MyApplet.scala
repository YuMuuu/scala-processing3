import processing.core.PApplet

class MyApplet extends PApplet {
  override def settings() {
    size(600, 400)
  }

  override def draw() {
    background(30)
    textSize(32)
    fill(100, 240, 200)
    text("Hello Processing", mouseX, mouseY)
  }
}
