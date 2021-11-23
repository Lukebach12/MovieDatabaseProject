package moviecritics.bo;

import java.io.Reader;

public class Director {

    private String dcName;
    private String dcDOB;
    private Reader dcGender;
    private int dcAge;
    private int dcRating;

    public Director(String dcName, String dcDOB, Reader dcGender, int dcAge, int dcRating){
        this.dcName = dcName;
        this.dcDOB = dcDOB;
        this.dcGender = dcGender;
        this.dcAge = dcAge;
        this.dcRating = dcRating;
    }

    public String getdcName(){
        return dcName;
    }

    public void setdcName(String dcName){
        this.dcName = dcName;
    }

    public String getdcDOB(){
        return dcDOB;
    }

    public void setdcDOB(String dcDOB){
        this.dcDOB = dcDOB;
    }

    public Reader getdcGender(){
        return dcGender;
    }

    public void setdcGender(Reader dcGender){
        this.dcGender = dcGender;
    }

    public int getdcAge(){
        return dcAge;
    }

    public void setdcAge(int dcAge){
        this.dcAge = dcAge;
    }

    public int getdcRating(){
        return dcAge;
    }

    public void setdcRating(int dcRating){
        this.dcRating = dcRating;
    }

}
