package edu.luc.cs.cs271.lab2;

/** A sports team. */
public class Team {
  /** The team's name. */
  private String name;

  /** The team's head coach. */
  private String headcoach;

  /** The team's monetary funding level in thousands of US$. */
  private int funding;

  /** Constructs a new team. */
  public Team(final String name, final String headcoach, final int funding) {
    if (name == null) {
      throw new IllegalArgumentException("name is null");
    }
    // Completed validity checking for headcoach
    if (headcoach == null) {
      throw new IllegalArgumentException("headcoach is null");
    }
    // Completed validity checking for funding
    if (funding == -1) {
      throw new IllegalArgumentException("no funding");
    }
    // Completed  this constructor
    this.name = name;
    this.headcoach = headcoach;
    this.funding = funding;

  }

  /** Returns the team's name. */
  public String getName() {
    return this.name;
  }

  /** Returns the team's head coach. */
  public String getHeadcoach() {
    // Completed this method
    return this.headcoach;
  }

  /** Returns the team's funding level. */
  public int getFunding() {
    // Completed this method
    return this.funding;
  }
}
