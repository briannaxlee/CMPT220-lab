package lab8;

import java.util.Calendar; //
import java.util.GregorianCalendar; //

// need to answer step 6 in code

public class Card
{
    private String name;

    public Card()
    {
        name = "";
    }

    public Card(String n)
    {
        name = n;
    }

    public String getName()
    {
        return name;
    }

    public boolean isExpired()
    {
        return false;
    }

    public String format()
    {
        return "Card holder: " + name;
    }
    
    public String toString()

    {
    	return "Card[name=" + this.name + "]";
    }
    
    public boolean equals(Card aCard)
    {
    	return (this.name.equals(aCard.name));
    } 
}

class CallingCard extends Card
{
    private String cardNumber;
    private String pin;

    public CallingCard(String name, String theCardNum, String thePin)
    {
        super(name);
        cardNumber = theCardNum;
        pin = thePin;
    }
    
    public String format()
    {
    	return super.format() + " Card Number: " + cardNumber + " Pin: " + pin;
    }
    
    public String toString()
    {
    	return "CallingCard[name=" + this.getName() + "][number=" + 
    	this.cardNumber + ", pin=" + this.pin + "]";
    }
     
    public boolean isExpired()
    {
        return false;  
    }
     
    public String getCardNum()
    {
        return cardNumber;
    }
     
    public String getPIN()
    {
        return pin;
    }
     
    public boolean equals(CallingCard aCard)
    {
    	return (super.equals(aCard) && this.cardNumber.equals(aCard.cardNumber)
    			&& (this.pin.equals(aCard.pin)));
    }
}

class IDCard extends Card
{
     public String idNumber;

     public IDCard(String name, String theIdNum)
     {
    	 super(name);
         idNumber = theIdNum;
     }
     
     public String format()
     {
    	 return super.format() + " Id Number: " + this.idNumber;
     }
     
     public String toString()
     {
    	 return "IDCard[name=" + this.getName() + "][idNumber=" + this.idNumber + "]";
     }
     
     public boolean isExpired()
     {
     	return false;  
     }
     
     public String getId()
     {
     	return idNumber;
     }
     
     public boolean equals(IDCard aCard)
     {
    	 return (super.equals(aCard) && this.idNumber.equals(aCard.idNumber));
     }
}

class DriverLicense extends IDCard
{
    GregorianCalendar calendar = new GregorianCalendar();
    
    private int expirationYear; // yyyy

    public DriverLicense(String name, String idNumber, int theExpirationYear)
    {
        super(name, idNumber);
        this.expirationYear = theExpirationYear;
    }
    
    public String format()
    {
    	return super.format() + " Expiration Year: " + expirationYear;
    }
    
    public String toString()
    {
	    return "DriverLicense [name=" + this.getName() + "][number=" + this.idNumber + "]"
	    		+ "[expirationYear=" + this.expirationYear + "]";  
    } 
    
    public boolean isExpired()
    {
        if(expirationYear < calendar.get(Calendar.YEAR))
        {
            return true;
        } else {
            return false;
        }       
    }
    
    public boolean equals(DriverLicense aCard)
    {
    	return (super.equals(aCard) && this.expirationYear == aCard.expirationYear);
    }
}
