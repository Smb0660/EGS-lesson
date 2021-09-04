package reflection;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflection {


    public void name(Object object){
        Class name = object.getClass();
        System.out.println("Class name  - " +name.getName());
    }
    public void showFields(Object object){
        Class fieldNames = object.getClass();
        Field field[] = fieldNames.getDeclaredFields();
        System.out.println("Fields  - " +Arrays.toString(field));
    }
    public void getMethods(Object object){
        Class methodNames = object.getClass();
        Method method[] = object.getClass().getMethods();
        System.out.println("Methods - " + Arrays.toString(method));
    }
    public void setPrivateFields(Object object) throws IllegalAccessException {
        Class privateField = object.getClass();
        Field field[] = privateField.getDeclaredFields();
        for (Field field1: field) {
            AnimalAnnotation annotation =  field1.getAnnotation(AnimalAnnotation.class);
            if (annotation == null) continue;
            field1.setAccessible(true);
            field1.set(object,"Rex");
            field1.setAccessible(false);
        }

    }
    public void getConstructor(Object object){
        Class getConstructor = object.getClass();
       Constructor constructor[] =  getConstructor.getConstructors();
        System.out.println("Constructors - " + Arrays.toString(constructor));
    }
    public Object newObject(Object object) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Object instanceObject = null;
        Class newObj = Class.forName("reflection.Animal");
        instanceObject =  newObj.newInstance();
        return instanceObject;

    }


    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Animal animal = new Animal("Guf",2,"Labrador Retriever","Jackson");
        Reflection reflection = new Reflection();
        reflection.name(animal);
        reflection.showFields(animal);
        reflection.getMethods(animal);
        reflection.setPrivateFields(animal);
        reflection.getConstructor(animal);


    }
}
