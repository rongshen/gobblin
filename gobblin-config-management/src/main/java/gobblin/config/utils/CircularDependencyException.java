package gobblin.config.utils;

public class CircularDependencyException extends RuntimeException {

  /**
   * 
   */
  private static final long serialVersionUID = -164765448729513949L;

  public CircularDependencyException(String message) {
    super(message);
  }
}
