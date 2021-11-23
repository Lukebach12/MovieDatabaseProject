package moviecritics.bo;

import java.io.Reader;

public class Actor {

    private String acName;
    private String acDOB;
    private Reader acGender;
    private int acAge;
    private int acRating;

    public Actor(String acName, String acDob, Reader acGender, int acAge, int acRating){
        this.acName = acName;
        this.acDOB = acDob;
        this.acGender = acGender;
        this.acAge = acAge;
        this.acRating = acRating;
    }

    public String getAcName(){
        return acName;
    }

    public void setAcName(String acName){
        this.acName = acName;
    }

    public String getAcDOB(){
        return acDOB;
    }

    public void setAcDOB(String acDOB){
        this.acDOB = acDOB;
    }

    public Reader getAcGender(){
        return acGender;
    }

    public void setAcGender(Reader acGender){
        this.acGender = acGender;
    }

    public int getAcAge(){
        return acAge;
    }

    public void setAcAge(int acAge){
        this.acAge = acAge;
    }

    public int getAcRating(){
        return acAge;
    }

    public void setAcRating(int acRating){
        this.acRating = acRating;
    }

}
