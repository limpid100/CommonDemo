package com.dxl.commondemo.util;

import android.content.ContextWrapper;
import android.database.sqlite.SQLiteDatabase;

import com.dxl.commondemo.app.CommonApp_;
import com.dxl.commondemo.greendao.DaoMaster;
import com.dxl.commondemo.greendao.DaoSession;

import org.greenrobot.greendao.database.Database;

import java.io.File;
import java.io.IOException;

/**
 * desc   :
 *
 * @author : dxl
 * @version : 1.0
 * e-mail : du_xiaolong@hotmail.com
 * @date : 2020/6/10 10:52 AM
 */
public final class DbUtils {

    private static DaoSession sDaoSession;

    public static void init() {
        getDaoSession();
    }

    private static DaoSession getDaoSession(){
        if (sDaoSession == null) {
            synchronized (DbUtils.class) {
                if (sDaoSession == null) {
                    DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(new ContextWrapper(CommonApp_.getAppContext()) {
                        @Override
                        public File getDatabasePath(String name) {
                            File database = CommonApp_.getAppContext().getExternalFilesDir("database");
                            if (database == null) {
                                return super.getDatabasePath(name);
                            }
                            if (!database.exists()) {
                                boolean b = database.mkdirs();
                                if (!b) {
                                    return super.getDatabasePath(name);
                                }
                            }

                            File file = new File(database, name);
                            boolean createSuccess = false;
                            if (!file.exists()) {
                                try {
                                    createSuccess = file.createNewFile();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            } else {
                                createSuccess = true;
                            }
                            if (createSuccess) {
                                return file;
                            } else {
                                return super.getDatabasePath(name);
                            }
                        }

                        @Override
                        public SQLiteDatabase openOrCreateDatabase(String name, int mode, SQLiteDatabase.CursorFactory factory) {
                            return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(name), factory);
                        }
                    },
                            "common.db", null){
                        @Override
                        public void onUpgrade(Database db, int oldVersion, int newVersion) {
                            DaoMaster.createAllTables(db, true);
                        }

                        @Override
                        public void onCreate(Database db) {
                            DaoMaster.createAllTables(db, false);
                        }
                    };
                    sDaoSession = new DaoMaster(devOpenHelper.getWritableDb()).newSession();
                }
            }
        }
        return sDaoSession;
    }

}
