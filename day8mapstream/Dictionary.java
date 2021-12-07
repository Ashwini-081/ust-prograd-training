/* public class Dictionary {
  public static void main(String[] args) {
    public Dictionary(){
        Dictionary d = new Dictionary();
        }

    public void newEntry(String key, String value){
      d.newEntry("Apple", "A fruit that grows on trees");
      
    }

    public String look(String key){
      System.out.println(d.look("Apple"));
      System.out.println(d.look("Banana"));
    }
  } 
} */

import java.util.HashMap;
public class Dictionary
{
  public static void main(String[] args) {
    private HashMap<String, String> map;
      public Dictionary() {
        map = new HashMap<>();
      }
  public void newEntry(String key, String value) {
    map.put("Apple", "A fruit that grows on trees");
  }
  public String look(String key) {
    return map.getOrDefault(key, "Cant find entry for " + key);
  }
 }
}
