package pollub.ism.lab08;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {
        pollub.ism.lab08.PozycjaMagazynowa.class,
        pollub.ism.lab08.ChangeHistory.class
    },
    version = pollub.ism.lab08.BazaMagazynowa.WERSJA, exportSchema = false)
public abstract class BazaMagazynowa extends RoomDatabase {

    public static final String NAZWA_BAZY = "Stoisko z warzywami2";
    public static final int WERSJA = 1;

    public abstract pollub.ism.lab08.PozycjaMagazynowaDAO pozycjaMagazynowaDAO();
    public abstract pollub.ism.lab08.ChangeHistoryDAO changeHistoryDAO();
}
