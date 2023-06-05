package by.epam.pattern.factorysupplier;


import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;
import java.util.function.BiFunction;
import java.util.function.Supplier;

interface FactoryStudent {
    static EntityObject createEnity(BiFunction<Map<Integer, String>, Integer, EntityObject> function, Map<Integer, String> base, int key) {
        return function.apply(base, key);
    }
}
class  EntityBiFunction implements BiFunction<Map<Integer, String>, Integer, EntityObject>{

    @Override
    public EntityObject apply(Map<Integer, String> mapInput, Integer key) {
        EntityObject entityObject = new EntityObject();
        entityObject.setEntityId(key);
        entityObject.setLastname(mapInput.get(key));
        return entityObject;
    }
}
 class EntityObject {
    private int entityId;
    private String lastname;

     public EntityObject() {
     }

     public void setEntityId(int entityId) {
         this.entityId = entityId;
     }

     public void setLastname(String lastname) {
         this.lastname = lastname;
     }

     @Override
    public String toString() {
        return new StringJoiner(", ", "EntityObject[", "]")
                .add("id=" + entityId)
                .add("lastname='" + lastname + "'")
                .toString();
    }
}
public class EntityObjectMain {
    public static void main(String[] args) {
        Map<Integer, String> inputMap = new HashMap<>();
        inputMap.put(777, "john");
        inputMap.put(771, "jane");

        EntityObject entity = FactoryStudent.createEnity(new EntityBiFunction(), inputMap, 772);
        System.out.println(entity);
    }
}
class A {
   static int generator(){
     return new Supplier<Integer>() {
          static int count;
          @Override
          public Integer get() {
              return ++count;
          }
      }.get();
    }
}
class Main{
    public static void main(String[] args) {
        System.out.println(A.generator());
        System.out.println(A.generator());
    }
}