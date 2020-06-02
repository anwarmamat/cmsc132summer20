package fraction;

public class Fraction{
  private int denum;
  private int numer;

  public Fraction(){
    this(1,5);
  }

  public Fraction(int n, int d){
		//TODO
	}

  public boolean isWhole(){
		//TODO
	}

  public Fraction add(Fraction other){
		//TODO
	}

  public Fraction sub(Fraction other){
		//TODO
	}
  private Fraction multiply(Fraction other){
		//TODO
	}

  private Fraction divide(Fraction other){
		//TODO
	}


  private Fraction reduce(){
		//TODO
	}

  public boolean isEqual(Fraction other){
    return other.numer == this.numer && other.denum == this.denum;
  }

  public Fraction product(Fraction n)   {return multiply(n);}
  public Fraction quotient(Fraction n)  {return divide(n);}
  public Fraction difference(Fraction n){return sub(n);}
  public Fraction sum(Fraction n)       {return add(n);}
  public Fraction simplify()            {return reduce();}
  public int getNumer(){return numer;}
  public int getDenum(){return denum;}
}
