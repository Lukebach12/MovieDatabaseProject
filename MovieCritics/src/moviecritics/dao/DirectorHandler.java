package moviecritics.dao;

import moviecritics.Utils.SQLUtil;
import moviecritics.bo.Actor;
import moviecritics.bo.Director;

import java.io.Reader;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DirectorHandler {

    private SQLUtil sqlUtil;

    public DirectorHandler(){
        sqlUtil = new SQLUtil();
    }

    public List<Director> loadDirectors(){
        List<Director> dcs = new ArrayList<>();
        try{
            String stmStr = "select * from Director";
            ResultSet rsDirectors = sqlUtil.executeQuery(stmStr);
            while(rsDirectors.next()){
                String dcName = rsDirectors.getString("dcName");
                String dcDOB = rsDirectors.getString("dcDOB");
                Reader dcGender = rsDirectors.getCharacterStream("dcGender");
                int dcAge = rsDirectors.getInt("dcAge");
                int dcRating = rsDirectors.getInt("dcRating");
                Director director = new Director(dcName, dcDOB, dcGender, dcAge, dcRating);
                dcs.add(director);
            }
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return dcs;
    }
}
