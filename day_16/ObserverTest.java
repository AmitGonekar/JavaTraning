package day_16;

import java.util.ArrayList;
import java.util.List;

// Observer Interface
 interface Observer {
     void update(String message);
 }


 // Subject Interface
 interface Subject {
     void subscribe(Observer o);
     void unsubscribe(Observer o);
     void notifyObservers();
 }

 // Concrete Subject
class NotificationService implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String message;

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }

    public void subscribe(Observer o) {
        observers.add(o);
    }

    public void unsubscribe(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(message);
        }
    }
}

// Concrete Observer
class User implements Observer {

    private String name;

    User(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}

// Test
public class ObserverTest {
    public static void main(String[] args) {

        NotificationService service = new NotificationService();

        User u1 = new User("Amit");
        User u2 = new User("Rahul");

        service.subscribe(u1);
        service.subscribe(u2);

        service.setMessage("New Video Uploaded!");
    }
}


