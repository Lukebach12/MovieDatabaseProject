package moviecritics.bo;

public class Movie {

    private String mTitle;
    private String mActor;
    private String mGenre;
    private String mDirector;
    private int mRunTime;
    private int mRating;
    private String mDate;

    public Movie(String mTitle, String mActor, String mGenre, String mDirector, int mRunTime, int mRating, String mDate){
        this.mTitle = mTitle;
        this.mActor = mActor;
        this.mGenre = mGenre;
        this.mDirector = mDirector;
        this.mRunTime = mRunTime;
        this.mRating = mRating;
        this.mDate = mDate;
    }

    public String getmTitle(){
        return mTitle;
    }

    public void SetmTitle(String mTitle){
        this.mTitle = mTitle;
    }

    public String getmActor(){
        return mActor;
    }

    public void SetmActor(String mActor){
        this.mActor = mActor;
    }

    public String getmGenre(){
        return mGenre;
    }

    public void SetmGenre(String mGenre){
        this.mGenre = mGenre;
    }

    public String getmDirector(){
        return mDirector;
    }

    public void SetmDirector(String mDirector){
        this.mDirector = mDirector;
    }

    public int getmRunTime(){
        return mRunTime;
    }

    public void SetmRuntime(int mRunTime){
        this.mRunTime = mRunTime;
    }

    public int getmRating(){
        return mRating;
    }

    public void SetmRating(int mRating){
        this.mRating = mRating;
    }

    public String getmDate(){
        return mDate;
    }

    public void SetmDate(String mDate){
        this.mDate = mDate;
    }

}
