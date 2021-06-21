package pollub.ism.lab08;

import androidx.room.Dao;
import androidx.room.Query;
import java.util.List;

@Dao
public interface ChangeHistoryDAO {

    @Query("INSERT INTO History (veg_key, DATE, TIME, OLDQUANTITY,NEWQUANTITY) VALUES (:wybraneWarzywoID, CURRENT_DATE, CURRENT_TIME, :staraWartosc, :nowaWartosc)")
    void insertHistory(int wybraneWarzywoID, int staraWartosc, int nowaWartosc);

    @Query("SELECT * FROM History WHERE veg_key= :wybraneWarzywoID")
    List<ChangeHistory> findHistoryByID(int wybraneWarzywoID);
}
