# jfx-ShapeEngine

jfx-ShapeEngine is a shape engine for javaFX that can be used for software wich need to draw interactives shapes like circle, rectangle, polygon etc.  

The engine bring many features like a grid system, a magnetism system among shapes and grid, an interactive way to draw shape and much more.  
  
This project was developed for [InnoEvent](https://github.com/remigastaldi/InnoEvent), a plan creation software, there is only rectangle and polygon shapes as we only need them.  Engine`s shapes can be easily extends features of shape to have different behavior and add fonctionnities to them.  
You can have a look to [InnoEvent](https://github.com/remigastaldi/InnoEvent) to see the possibilites :)
  
## Features

- Board size customisation {Background, Width, Height}
- Scrollbar
- Automatic board center
- Custom cursor system wich can be customized according to the current shape
- Grid system
- Magnetism system
- Zoom in / out
- Entire grid customisation {Color of lines, Space between lines on x,y}
- Shape's bounds handling (to keep all element in board per example)
- Activate / disable magnetism
- **Shape**
  - Interactive drawing
  - Delete
  - Moving by points
  - Customisation of background, opacity and outlines
  - Ability to add any form of javafx in the engine among those of the engine
  - Ability to add any form of javafx in the engine among those of the engine which only appear when the shape is selected

## Current shapes

- [x] Rectangle
- [x] Polygon
- [ ] Circle
- [ ] Line

## Compilation

Ensure to have java JRE, JRE and JFX in your path.

Build jar:

```bash
gradle build
```

An example of jar use is available under example folder.  