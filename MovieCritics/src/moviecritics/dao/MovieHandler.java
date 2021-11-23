package moviecritics.dao;

import moviecritics.Utils.SQLUtil;
import moviecritics.bo.Movie;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MovieHandler {

    private SQLUtil sqlUtil;

    public MovieHandler(){
        sqlUtil = new SQLUtil();
    }

    public int addMovie(String mActor, String mGenre, String mDirector, int mRunTime, int mRating, String mDate){
        String cmdTemplate = "insert into Movie(mActor, mGenre, mDirector, mRunTime, mRating, mDate) values(%s, %s, %s, %d, %d, %s)";
        String stmStr = String.format(cmdTemplate, mActor, mGenre, mDirector, mRunTime, mRating, mDate);
        return sqlUtil.executeUpdate(stmStr);
    }

    public int deleteMovie(String mTitle){
        String stm = String.format("delete from Movie where sTitle = %d", mTitle);
        return sqlUtil.executeUpdate(stm);
    }

    public int updateMovie(String mTitle, String mActor, String mGenre, String mDirector, int mRunTime, int mRating, String mDate){
        String cmdTemplate = "update Movie set mActor='%s', mGenre='%s', mDirector='%s', mRunTime='%d', mRating='%d', mDate='%d' where mTitle=%s ";
        String stmStr = String.format(cmdTemplate, mActor, mGenre, mDirector, mRunTime, mRating, mDate, mTitle);
        return sqlUtil.executeUpdate(stmStr);
    }

    public List<Movie> getMovies(String keyword){
        String stmStr = String.format("select * from Movie where sActor like '%s'", "%"+keyword+"%");
        List<Movie> movies = new ArrayList<>();
        ResultSet rs = sqlUtil.executeQuery(stmStr);
        try{
            while(rs.next()){
                String mTitle = rs.getString("mTitle");
                String mActor = rs.getString("mActor");
                String mGenre = rs.getString("mGenre");
                String mDirector = rs.getString("mDirector");
                int mRuntime = rs.getInt("mRunTime");
                int mRating = rs.getInt("mRating");
                String mDate = rs.getString("mDate");
                Movie m = new Movie(mTitle, mActor, mGenre, mDirector, mRuntime, mRating, mDate);
                movies.add(m);
            }

        } catch (Exception ex){
            ex.printStackTrace();
        }
        return movies;
    }
}
