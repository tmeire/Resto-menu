
package be.ugent.zeus.resto.client.data;

import java.io.Serializable;

/**
 *
 * @author Thomas Meire
 */
public class Building implements Serializable {

  public static final int TYPE_RESTO = 0;
  public static final int TYPE_HOME  = 1;

  public String name;
  public String address;
  public Integer longitude;
  public Integer latitude;
  public Integer type;
}
