package com.kardavel.takson.cloudvision;

/**
 * Created by holon on 5/13/2017.
 */
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper
{
    private static final String DATABASE_NAME = "takson.db";
    private static final String TABLE_NAME = "hewan";
    private static final int DATABASE_VERSION = 1;
    private SQLiteDatabase db;
    private DataHelper dbHelper;
    private Context context;

    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        String sql = "CREATE TABLE hewan(id integer primary key, nama text null, namaindo text null, kingdom text null, filum text null, kelas text null, ordo text null, famili text null, genus text null, spesies text null, ciri text null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT INTO hewan (id, nama, namaindo, kingdom, filum, kelas, ordo, famili, genus, spesies, ciri) VALUES " +
                "('1', 'cat', 'Kucing', 'Animalia', 'Chordata', 'Mammalia', 'Carnivora', 'Felidae', 'Felis', 'Felis catus', 'Bernapas dengan paru-paru, suhu tubuh Homoioterm, memiliki 4 ruang jantung yaitu 2 serambi dan 2 bilik, memiliki kelenjar susu')," +
                "('2', 'dog', 'Anjing', 'Animalia', 'Chordata', 'Mammalia', 'Carnivora', 'Canidae', 'Canis', 'Canis lupus', 'Bernapas dengan paru-paru, suhu tubuh Homoioterm, memiliki 4 ruang jantung yaitu 2 serambi dan 2 bilik, memiliki kelenjar susu')," +
                "('3', 'tiger', 'Harimau', 'Animalia', 'Chordata', 'Mammalia', 'Carnivora', 'Felidae', 'Panthera', 'Panthera tigris', 'Bernapas dengan paru-paru, suhu tubuh Homoioterm, memiliki 4 ruang jantung yaitu 2 serambi dan 2 bilik, memiliki kelenjar susu')," +
                "('4', 'buffalo', 'Kerbau', 'Animalia', 'Chordata', 'Mammalia', 'Artiodactyla', 'Bovidae', 'Bubalus', 'Bubalus bubalis', 'Bernapas dengan paru-paru, suhu tubuh Homoioterm, memiliki 4 ruang jantung yaitu 2 serambi dan 2 bilik, memiliki kelenjar susu')," +
                "('5', 'chicken', 'Ayam', 'Animalia', 'Chordata', 'Aves', 'Galliformes', 'Phasianidae', 'Gallus', 'Gallus gallus domesticus','Bernapas dengan paru-paru, suhu tubuh Homoioterm, memiliki 4 ruang jantung yaitu 2 serambi dan 2 bilik')," +
                "('6', 'cow', 'Sapi', 'Animalia', 'Chordata', 'Mammalia', 'Artiodactyla', 'Bovidae', 'Bos', 'Bos taurus', 'Bernapas dengan paru-paru, suhu tubuh Homoioterm, memiliki 4 ruang jantung yaitu 2 serambi dan 2 bilik, memiliki kelenjar susu')," +
                "('7', 'horse', 'Kuda', 'Animalia', 'Chordata', 'Mammalia', 'Perissodactyla', 'Equidae', 'Equus', 'Equus caballus', 'Bernapas dengan paru-paru, suhu tubuh Homoioterm, memiliki 4 ruang jantung yaitu 2 serambi dan 2 bilik, memiliki kelenjar susu')," +
                "('8', 'elephant', 'Gajah', 'Animalia', 'Chordata', 'Mammalia', 'Proboscidea', 'Elephantidae', 'Elephas', 'Elephas maximus', 'Bernapas dengan paru-paru, suhu tubuh Homoioterm, memiliki 4 ruang jantung yaitu 2 serambi dan 2 bilik, memiliki kelenjar susu')," +
                "('9', 'fish', 'Ikan', 'Animalia', 'Chordata', 'Actinopterygii', 'Cypriniformes', 'Cyprinidae', 'Cyprinus', 'Cyprinus carpio', 'Bernapas dengan Insang, suhu tubuh Poikiloterm, Kulit berlendir, memiliki 2 ruang jantung yaitu 1 serambi dan 1 bilik')," +
                "('10', 'crocodile', 'Buaya', 'Animalia', 'Chordata', 'Sauropsida', 'Crocodilia', 'Crocodylidae', 'Crocodylus', 'Crocodylus palustris', 'Bernapas dengan paru-paru, suhu tubuh Poikiloterm, memiliki 4 ruang jantung yaitu 2 serambi dan 2 bilik, merupakan hewan yang bergerak dengan cara melata')," +
                "('11', 'monkey', 'Monyet', 'Animalia', 'Chordata', 'Mammalia', 'Primata', 'Cercopithecidae', 'Macaca', 'Macaca fascicularis', 'Bernapas dengan paru-paru, suhu tubuh Homoioterm, memiliki 4 ruang jantung yaitu 2 serambi dan 2 bilik, memiliki kelenjar susu')," +
                "('12', 'frog', 'Katak', 'Animalia', 'Chordata', 'Amphibia', 'Anura ', 'Ranidae', 'Rana', 'Rana cancrivora', 'Bernapas dengan insang, paru-paru, kulit, suhu tubuh Poikiloterm, Kulit berlendir, memiliki 3 ruang jantung yaitu 2 serambi dan 1 bilik, merupakan hewan peralihan antara hewan air dan darat')";
        db.execSQL(sql);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        String sql = "DROP TABLE IF EXISTS " + DATABASE_NAME;
        db.execSQL(sql);
        onCreate(db);
    }
}
