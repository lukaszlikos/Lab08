package pollub.ism.lab08;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "History",
    foreignKeys = @ForeignKey(entity = PozycjaMagazynowa.class,
    parentColumns = "_id",
    childColumns = "veg_key",
    onDelete = CASCADE),
    indices = {@Index(value = {"veg_key"})})
public class ChangeHistory {

    @PrimaryKey(autoGenerate = true)
    public int _id;
    public int veg_key;
    public String DATE;
    public String TIME;
    public int OLDQUANTITY;
    public int NEWQUANTITY;
}
