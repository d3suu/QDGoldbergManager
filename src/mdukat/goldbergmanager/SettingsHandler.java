package mdukat.goldbergmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class SettingsHandler {

    public static String getAppDataPath(){
        return System.getenv("appdata");
    }

    public static String getGoldbergSettings(){
        return getAppDataPath() + "\\Goldberg SteamEmu Saves\\settings";
    }

    public static String getSteamIDPath(){
        return getGoldbergSettings() + "\\user_steam_id.txt";
    }

    public static String getSteamUsernamePath(){
        return getGoldbergSettings() + "\\account_name.txt";
    }

    public static String getSteamID(){

        BufferedReader reader;
        String retVal;

        try {
            reader = new BufferedReader(new FileReader(getSteamIDPath()));
            retVal = reader.readLine();
            reader.close();
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }

        return retVal;

    }

    public static boolean setSteamID(String steamID){
        try {
            FileWriter fw = new FileWriter(getSteamIDPath(), false);
            fw.write(steamID);
            fw.close();
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public static String getSteamUsername(){

        BufferedReader reader;
        String retVal;

        try {
            reader = new BufferedReader(new FileReader(getSteamUsernamePath()));
            retVal = reader.readLine();
            reader.close();
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }

        return retVal;

    }

    public static boolean setSteamUsername(String steamUsername){
        try {
            FileWriter fw = new FileWriter(getSteamUsernamePath(), false);
            fw.write(steamUsername);
            fw.close();
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
