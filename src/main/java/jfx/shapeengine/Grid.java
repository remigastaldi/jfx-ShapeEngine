/*
 * File Created: Saturday, 13th October 2018
 * Author: GASTALDI Rémi
 * -----
 * Last Modified: Wednesday, 2nd January 2019
 * Modified By: GASTALDI Rémi
 * -----
 * Copyright - 2018 GASTALDI Rémi
 * <<licensetext>>
 */


package jfx.shapeengine;

import java.util.ArrayList;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;

public class Grid {
  private Pane  _pane = null;
  private ArrayList<Line> _lines = new ArrayList<>();
  private double  _xSpacing = 5.0;
  private double  _ySpacing = 5.0;
  private Color _color = Color.WHITE;
  private double _width = 1.0;

  public Grid(Pane pane) {
    _pane = pane;
  }

  public void zoom(double factor) {
  }

  public void setXSpacing(double spacing) {
    _xSpacing = spacing;
  }

  public void setYSpacing(double spacing) {
    _ySpacing = spacing;
  }

  public void setColor(Color color) {
    _color = color;
  }

  public void setLinesWidth(double width) {
    _width = width;
  }

  public void activate() {
    double xNeeded = _pane.getPrefWidth() / _xSpacing;
    double yNeeded = _pane.getPrefHeight() / _ySpacing;
  
    for (double i = 1; i < xNeeded; i += _xSpacing) {
      double pos = i * _xSpacing;
      Line line = new Line(pos, 0, pos, _pane.getPrefHeight());

      line.setStroke(_color);
      line.setStrokeWidth(_width);
      _lines.add(line);
      _pane.getChildren().add(line);
      line.toBack();
    }
    
    for (double i = 1; i < yNeeded; i += _ySpacing) {
      double pos = i * _ySpacing;
      Line line = new Line(0, pos, _pane.getPrefWidth(), pos);

      line.setStroke(_color);
      line.setStrokeWidth(_width);
      _lines.add(line);
      _pane.getChildren().add(line);
      line.toBack();
    }
  }

  public void disable() {
    for (Line line : _lines) {
      _pane.getChildren().remove(line);
    }
  }

  public ArrayList<? extends Shape> getLines() {
    return _lines;
  }

  public void destroy() {
    for (Line line : _lines) {
      _pane.getChildren().remove(line);
    }
  }
}