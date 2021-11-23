package moviecritics.dao;

import moviecritics.Utils.SQLUtil;
import moviecritics.bo.Actor;

import java.io.Reader;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ActorHandler {

    private SQLUtil sqlUtil;

    public ActorHandler(){
        sqlUtil = new SQLUtil();
    }

    public List<Actor> loadActors(){
        List<Actor> acs = new ArrayList<>();
        try{
            String stmStr = "select * from Actor";
            ResultSet rsActors = sqlUtil.executeQuery(stmStr);
            while(rsActors.next()){
                String acName = rsActors.getString("acName");
                String acDOB = rsActors.getString("acDOB");
                Reader acGender = rsActors.getCharacterStream("acGender");
                int acAge = rsActors.getInt("acAge");
                int acRating = rsActors.getInt("acRating");
                Actor actor = new Actor(acName, acDOB, acGender, acAge, acRating);
                acs.add(actor);
            }
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return acs;
    }
}
