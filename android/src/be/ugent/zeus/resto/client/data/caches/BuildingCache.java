package be.ugent.zeus.resto.client.data.caches;

import android.content.Context;
import be.ugent.zeus.resto.client.data.Building;
import java.io.File;
import java.util.List;

/**
 * TODO: how are we going to implement the search functionality?
 * 
 * @author Thomas Meire
 */
public class BuildingCache extends Cache<Building> {

  private static BuildingCache cache;

  private BuildingCache(File buildingCacheDir) {
    super(buildingCacheDir);
  }
  
  public List<Building> search (int type) {
    return null;
  }
  
  public List<Building> search (String name) {
    return null;
  }

  public static synchronized BuildingCache getInstance(Context context) {
    if (cache == null) {
      File cacheDir = context.getCacheDir();
      File buildingCacheDir = new File(cacheDir, "buildings");
      cache = new BuildingCache(buildingCacheDir);
    }
    return cache;
  }
}
